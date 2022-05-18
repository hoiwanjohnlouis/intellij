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
 *  86
 *  DlvyInst
 *  String
 *  Deprecated in FIX.4.2 Free format text field to indicate delivery instructions
 */
// @Deprecated
public class Tag86StrDlvyInst extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_DLVY_INST = "BilboBaggins-86StDlvyInst"; // fake data
    public final static String TESTB_STR_DLVY_INST = "Gandalf-86StDlvyInst";

    public Tag86StrDlvyInst(MyStringType dataValue) {
        setFixType(FIX27.FIX86_STR_DLVY_INST);
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
        dumpDataValues( new Tag86StrDlvyInst(new MyStringType(TESTA_STR_DLVY_INST)) );
        dumpDataValues( new Tag86StrDlvyInst(new MyStringType(TESTB_STR_DLVY_INST)) );
    }
    /**
     *
     * @param tagData   Tag86StrDlvyInst
     */
    static void dumpDataValues(Tag86StrDlvyInst tagData) {
        System.out.println("-------------------- Start Tag86StrDlvyInst MyStringType --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("-------------------- End Tag86StrDlvyInst MyStringType --------------------");
    }
}