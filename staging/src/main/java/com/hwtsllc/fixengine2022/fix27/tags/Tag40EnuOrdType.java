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
 *  Order type.
 *
 *  *** SOME VALUES ARE NO LONGER USED ***
 *  *** See Deprecated (Phased-out) Features and Supported Approach ***
 *      (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      1 - Market
 *      2 - Limit
 *      3 - Stop / Stop Loss
 *      4 - Stop Limit
 *      5 - Market On Close (No longer used)
 *
 *      6 - With Or Without
 *      7 - Limit Or Better
 *      8 - Limit With Or Without
 *      9 - On Basis
 *
 *      A - On Close (No longer used)
 *      B - Limit On Close (No longer used)
 *      C - Forex Market (No longer used)
 *      D - Previously Quoted
 *      E - Previously Indicated
 *
 *      F - Forex Limit (No longer used)
 *      G - Forex Swap
 *      H - Forex Previously Quoted (No longer used)
 *      I - Funari
 *          (Limit day order with unexecuted portion handles as Market On Close.
 *           e.g. Japan)
 *      J - Market If Touched (MIT)
 *
 *      K - Market With Left Over as Limit
 *          (market order with unexecuted quantity becoming limit order at last price)
 *      L - Previous Fund Valuation Point (Historic pricing;  for CIV)
 *      M - Next Fund Valuation Point (Forward pricing;  for CIV)
 *      P - Pegged
 *      Q - Counter-order selection
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
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
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
        dumpDataValues(new Tag40EnuOrdType(TESTA_ENU_ORDER_TYPE));
        dumpDataValues(new Tag40EnuOrdType(TESTB_ENU_ORDER_TYPE));

        // loop around the ENUM and display
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            dumpDataValues(new Tag40EnuOrdType(oneEnum));
        }
    }
    static void dumpDataValues(Tag40EnuOrdType tagData) {
        System.out.println("-------------------- Start Enum --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End Enum --------------------");
    }
}
