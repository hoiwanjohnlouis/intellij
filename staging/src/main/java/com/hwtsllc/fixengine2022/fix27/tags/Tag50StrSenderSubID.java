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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  50
 *  SenderSubID
 *  String
 *  Assigned value used to identify specific message originator (desk, trader, etc.)
 */
public class Tag50StrSenderSubID extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_SENDER_SUB_ID = "BilboBaggins-50StSenderSubID"; // fake data
    public final static String TESTB_STR_SENDER_SUB_ID = "Gandalf-50StSenderSubID";

    public Tag50StrSenderSubID(MyStringType dataValue) {
        setFixType(FIX27.FIX50_STR_SENDER_SUB_ID);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
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
        dumpDataValues( new Tag50StrSenderSubID(new MyStringType(TESTA_STR_SENDER_SUB_ID)) );
        dumpDataValues( new Tag50StrSenderSubID(new MyStringType(TESTB_STR_SENDER_SUB_ID)) );
    }
    /**
     *
     * @param tagData   Tag50StrSenderSubID
     */
    static void dumpDataValues(Tag50StrSenderSubID tagData) {
        System.out.println("-------------------- Start String --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End String --------------------");
    }
}
