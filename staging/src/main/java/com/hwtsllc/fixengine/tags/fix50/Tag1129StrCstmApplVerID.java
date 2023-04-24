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

package com.hwtsllc.fixengine.tags.fix50;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1129
 *  CstmApplVerID
 *  String
 *  <p>
 *  Specifies a custom extension to a message being applied at the message level. Enumerated field
 */
public class Tag1129StrCstmApplVerID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CSTM_APPL_VER_ID
            = "CorinneMarchand-Tag1129StrCstmApplVerID";
    public final static String TESTB_STR_CSTM_APPL_VER_ID
            = "Cleo-Tag1129StrCstmApplVerID";

    public Tag1129StrCstmApplVerID(MyStringType dataValue) {
        setFixType( FIX50.FIX1129_STR_CSTM_APPL_VER_ID );
        this.dataValue = dataValue;
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1129StrCstmApplVerID tagData;

        tagData = new Tag1129StrCstmApplVerID(new MyStringType( TESTA_STR_CSTM_APPL_VER_ID ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1129StrCstmApplVerID(new MyStringType( TESTB_STR_CSTM_APPL_VER_ID ) );
        System.out.println(tagData.toVerboseString());
    }
}
