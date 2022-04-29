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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum430NetGrossInd;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  Tag430
 *  Enu
 *  NetGrossInd
 *
 *      1-2 msg types
 *      NET( "1", "NET", "1 - Net" ),
 *      GROSS( "2", "GROSS", "2 - Gross" ),
 */
public class Tag430EnuNetGrossInd extends FIX42Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum430NetGrossInd dataValue;

    public final static Enum430NetGrossInd TESTA_ENU_NET_GROSS_IND = Enum430NetGrossInd.GROSS;
    public final static Enum430NetGrossInd TESTB_ENU_NET_GROSS_IND = Enum430NetGrossInd.NET;

    public Tag430EnuNetGrossInd(Enum430NetGrossInd dataValue) {
        setFixType(FIX42.FIX430_ENU_NET_GROSS_IND);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
        Tag430EnuNetGrossInd tagData;

        tagData = new Tag430EnuNetGrossInd(TESTA_ENU_NET_GROSS_IND);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag430EnuNetGrossInd(TESTB_ENU_NET_GROSS_IND);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
