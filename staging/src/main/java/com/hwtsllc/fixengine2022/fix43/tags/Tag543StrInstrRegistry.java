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
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  543
 *  InstrRegistry
 *  String
 *  <p>
 *  Values may include BIC for the depository or custodian who maintain ownership records,
 *  the ISO country code for the location of the record, or the value "ZZ" to specify
 *  physical ownership of the security (e.g. stock certificate).
 */
public class Tag543StrInstrRegistry extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_INSTR_REGISTRY
            = "BilboBaggins-Tag543StrInstrRegistry";
    public final static String TESTB_STR_INSTR_REGISTRY
            = "Gandalf-Tag543StrInstrRegistry";

    public Tag543StrInstrRegistry(MyStringType dataValue) {
        setFixType(FIX43.FIX543_STR_INSTR_REGISTRY);
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
        Tag543StrInstrRegistry tagData;

        tagData = new Tag543StrInstrRegistry(new MyStringType(TESTA_STR_INSTR_REGISTRY) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag543StrInstrRegistry(new MyStringType(TESTB_STR_INSTR_REGISTRY) );
        System.out.println(tagData.toVerboseString());
    }
}
