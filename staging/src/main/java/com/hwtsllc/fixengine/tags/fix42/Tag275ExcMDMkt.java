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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.datatypes.MyExchangeType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  275
 *  MDMkt
 *  Exchange
 *  <p></p>
 *  Deprecated in FIX.5.0 Market posting quote / trade.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  See "Appendix 6-C"
 */
public class Tag275ExcMDMkt extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyExchangeType dataValue;

    public final static String TESTA_EXC_MD_MKT
            = "BilboBaggins-Tag275ExcMDMkt";
    public final static String TESTB_EXC_MD_MKT
            = "Gandalf-Tag275ExcMDMkt";

    public Tag275ExcMDMkt(MyExchangeType dataValue) {
        setFixType(FIX42.FIX275_EXC_MD_MKT);
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
        Tag275ExcMDMkt tagData;

        tagData = new Tag275ExcMDMkt(new MyExchangeType(TESTA_EXC_MD_MKT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag275ExcMDMkt(new MyExchangeType(TESTB_EXC_MD_MKT) );
        System.out.println(tagData.toVerboseString());
    }
}
