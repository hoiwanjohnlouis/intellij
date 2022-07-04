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
import com.hwtsllc.fixengine2022.fix27.enums.Enum40OrdType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  40
 *  OrdType
 *  char
 *  <p></p>
 *  Order type.
 *  <p></p>
 *  *** SOME VALUES ARE NO LONGER USED ***
 *  <p>
 *  *** See Deprecated (Phased-out) Features and Supported Approach ***
 *  <p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Market
 *  <p>    2 - Limit
 *  <p>    3 - Stop / Stop Loss
 *  <p>    4 - Stop Limit
 *  <p>    5 - Market On Close (No longer used)
 *  <p></p>
 *  <p>    6 - With Or Without
 *  <p>    7 - Limit Or Better
 *  <p>    8 - Limit With Or Without
 *  <p>    9 - On Basis
 *  <p></p>
 *  <p>    A - On Close (No longer used)
 *  <p>    B - Limit On Close (No longer used)
 *  <p>    C - Forex Market (No longer used)
 *  <p>    D - Previously Quoted
 *  <p>    E - Previously Indicated
 *  <p></p>
 *  <p>    F - Forex Limit (No longer used)
 *  <p>    G - Forex Swap
 *  <p>    H - Forex Previously Quoted (No longer used)
 *  <p>    I - Funari
 *          (Limit day order with unexecuted portion handles as Market On Close.
 *           e.g. Japan)
 *  <p>    J - Market If Touched (MIT)
 *  <p></p>
 *  <p>    K - Market With Left Over as Limit
 *          (market order with unexecuted quantity becoming limit order at last price)
 *  <p>    L - Previous Fund Valuation Point (Historic pricing;  for CIV)
 *  <p>    M - Next Fund Valuation Point (Forward pricing;  for CIV)
 *  <p>    P - Pegged
 *  <p>    Q - Counter-order selection
 */
public class Tag40EnuOrdType extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum40OrdType dataValue;

    public final static Enum40OrdType TESTA_ENU_ORDER_TYPE
            = Enum40OrdType.MARKET;
    public final static Enum40OrdType TESTB_ENU_ORDER_TYPE
            = Enum40OrdType.LIMIT;

    public Tag40EnuOrdType(Enum40OrdType dataValue) {
        setFixType(FIX27.FIX40_ENU_ORD_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(getDataValue());
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
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
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
        System.out.println( new Tag40EnuOrdType(TESTA_ENU_ORDER_TYPE).toVerboseString() );
        System.out.println( new Tag40EnuOrdType(TESTB_ENU_ORDER_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            System.out.println( new Tag40EnuOrdType(oneEnum).toVerboseString() );
        }
    }
}
