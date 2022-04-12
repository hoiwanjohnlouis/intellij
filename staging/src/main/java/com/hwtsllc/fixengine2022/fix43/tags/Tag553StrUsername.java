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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag553StrUsername extends FIX43Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyStringType dataValue;

    public final static String TESTA_STR_USERNAME = "BilboBaggins-Tag553StrUsername";
    public final static String TESTB_STR_USERNAME = "Gandalf-Tag553StrUsername";

    public Tag553StrUsername(MyStringType dataValue) {
        setFixType(FIX43.FIX553_STR_PASSWORD);
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
        Tag553StrUsername tagData;

        tagData = new Tag553StrUsername( new MyStringType(TESTA_STR_USERNAME) );
        System.out.println("t1.1:" + tagData);
        System.out.println("t1.2:" + tagData.toLogStringVerbose());
        System.out.println("t1.3.FIXTypeName:" + tagData.getEnumName());
        System.out.println("t1.4.FIXNumber:" + tagData.getID());
        System.out.println("t1.5.FIXName:" + tagData.getName());
        System.out.println("t1.6.FIXDescription:" + tagData.getDescription());
        System.out.println("t1.7.DataValue:" + tagData.getDataValue());
        System.out.println("t1.8.FixString:" + tagData.toFixTagValuePairString());

        tagData = new Tag553StrUsername( new MyStringType(TESTB_STR_USERNAME) );
        System.out.println("t1.1:" + tagData);
        System.out.println("t1.2:" + tagData.toLogStringVerbose());
        System.out.println("t1.3.FIXTypeName:" + tagData.getEnumName());
        System.out.println("t1.4.FIXNumber:" + tagData.getID());
        System.out.println("t1.5.FIXName:" + tagData.getName());
        System.out.println("t1.6.FIXDescription:" + tagData.getDescription());
        System.out.println("t1.7.DataValue:" + tagData.getDataValue());
        System.out.println("t1.8.FixString:" + tagData.toFixTagValuePairString());
    }
}