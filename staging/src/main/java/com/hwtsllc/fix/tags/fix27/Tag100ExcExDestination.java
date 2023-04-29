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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.datatypes.FIX27;
import com.hwtsllc.fix.datatypes.FIX27Abstract;
import com.hwtsllc.fix.datatypes.MyExchangeType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  100
 *  ExDestination
 *  Exchange
 *  <p></p>
 *  Execution destination as defined by institution when order is entered.
 *  <p></p>
 *  Valid values:
 *  <p>     See "Appendix 6-C"
 */
public class Tag100ExcExDestination extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyExchangeType dataValue;

    public final static String TESTA_EXC_EX_DESTINATION
            = "AvaGardner-Tag100ExcExDestination";
    public final static String TESTB_EXC_EX_DESTINATION
            = "DeloresCostello-Tag100ExcExDestination";

    public Tag100ExcExDestination( MyExchangeType dataValue) {
        setFixType(FIX27.FIX100_EXC_EX_DESTINATION );
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
        System.out.println( new Tag100ExcExDestination(new MyExchangeType( TESTA_EXC_EX_DESTINATION )).toVerboseString() );
        System.out.println( new Tag100ExcExDestination(new MyExchangeType( TESTB_EXC_EX_DESTINATION )).toVerboseString() );
    }
}