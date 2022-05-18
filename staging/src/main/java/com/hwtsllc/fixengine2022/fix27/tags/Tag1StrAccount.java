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
 *  1
 *  Account
 *  String
 *  Account mnemonic as agreed between buy and sell sides,
 *  e.g. broker and institution or investor or intermediary and fund manager.
 */
public class Tag1StrAccount extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_ACCOUNT = "BilboBaggins-1StAccount";
    public final static String TESTB_STR_ACCOUNT = "Gandalf-1StAccount";

    public Tag1StrAccount(MyStringType dataValue) {
        setFixType(FIX27.FIX1_STR_ACCOUNT);
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
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
        dumpDataValues( new Tag1StrAccount(new MyStringType(TESTA_STR_ACCOUNT)) );
        dumpDataValues( new Tag1StrAccount(new MyStringType(TESTB_STR_ACCOUNT)) );
    }
    /**
     *
     * @param tagData   Tag1StrAccount
     */
    static void dumpDataValues(Tag1StrAccount tagData) {
        System.out.println("-------------------- Start Tag1StrAccount MyStringType --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("-------------------- End Tag1StrAccount MyStringType --------------------");
    }
}
