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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  375
 *  ContraBroker
 *  String
 *  <p></p>
 *  Identifies contra broker.
 *  <p></p>
 *  Standard NASD market-maker mnemonic is preferred.
 */
public class Tag375StrContraBroker extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CONTRA_BROKER
            = "MariaMontez-Tag375StrContraBroker";
    public final static String TESTB_STR_CONTRA_BROKER
            = "MariaAfricaAntoniaGraciaVidalDeSantoSilas-Tag375StrContraBroker";

    public Tag375StrContraBroker(MyStringType dataValue) {
        setFixType(FIX42.FIX375_STR_CONTRA_BROKER);
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
        Tag375StrContraBroker tagData;

        tagData = new Tag375StrContraBroker(new MyStringType(TESTA_STR_CONTRA_BROKER) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag375StrContraBroker(new MyStringType(TESTB_STR_CONTRA_BROKER) );
        System.out.println(tagData.toVerboseString());
    }
}
