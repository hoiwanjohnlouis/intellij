/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag31PxtLastPx extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyPriceType dataValue;

    public final static String TESTA_PXT_LAST_PX = "123.45";
    public final static String TESTB_PXT_LAST_PX = "67.89";

    public Tag31PxtLastPx(MyPriceType dataValue) {
        setFixType(FIX27.FIX31_PXT_LAST_PX);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag31PxtLastPx tagType;

        tagType = new Tag31PxtLastPx(new MyPriceType(TESTA_PXT_LAST_PX) );
        System.out.println(tagType);
        System.out.println(tagType.toLogStringVerbose());
        System.out.println(tagType.toFixTagValuePairString());

        tagType = new Tag31PxtLastPx(new MyPriceType(TESTB_PXT_LAST_PX) );
        System.out.println(tagType);
        System.out.println(tagType.toLogStringVerbose());
        System.out.println(tagType.toFixTagValuePairString());
    }
}

