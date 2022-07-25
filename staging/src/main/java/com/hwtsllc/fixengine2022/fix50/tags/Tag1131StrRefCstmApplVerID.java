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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1131
 *  RefCstmApplVerID
 *  String
 *  <p>
 *  Specifies a custom extension to a message being applied at the session level.
 */
public class Tag1131StrRefCstmApplVerID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_REF_CSTM_APPL_VER_ID
            = "TippiHedren-Tag1131StrRefCstmApplVerID";
    public final static String TESTB_STR_REF_CSTM_APPL_VER_ID
            = "NathalieKayHedren-Tag1131StrRefCstmApplVerID";

    public Tag1131StrRefCstmApplVerID(MyStringType dataValue) {
        setFixType( FIX50.FIX1131_STR_REF_CSTM_APPL_VER_ID );
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
        return toEnumIDString()
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
        Tag1131StrRefCstmApplVerID tagData;

        tagData = new Tag1131StrRefCstmApplVerID(new MyStringType( TESTA_STR_REF_CSTM_APPL_VER_ID ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1131StrRefCstmApplVerID(new MyStringType( TESTB_STR_REF_CSTM_APPL_VER_ID ) );
        System.out.println(tagData.toVerboseString());
    }
}
