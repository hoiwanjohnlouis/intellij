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
 *  76
 *  ExecBroker
 *  String
 *  <p></p>
 *  Identifies executing or give-up broker.
 *  <p></p>
 *  Standard NASD market-maker mnemonic is preferred.
 *  <p></p>
 *  Deprecated in FIX.4.2
 */
// @Deprecated
public class Tag76StrExecBroker extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_EXEC_BROKER
            = "AnnDvorak-Tag76StrExecBroker";
    public final static String TESTB_STR_EXEC_BROKER
            = "CaroleLombard-Tag76StrExecBroker";

    public Tag76StrExecBroker(MyStringType dataValue) {
        setFixType(FIX27.FIX76_STR_EXEC_BROKER);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(this.dataValue.toString());
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
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag76StrExecBroker(new MyStringType(TESTA_STR_EXEC_BROKER)).toVerboseString() );
        System.out.println( new Tag76StrExecBroker(new MyStringType(TESTB_STR_EXEC_BROKER)).toVerboseString() );
    }
}