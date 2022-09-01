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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.fix41.enums.Enum172SettlDeliveryType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  172
 *  SettlDeliveryType
 *  int
 *  <p></p>
 *  Identifies type of settlement
 *  <p></p>
 *  Valid values:
 *  <p>    0 - "Versus. Payment": Deliver (if Sell) or Receive (if Buy) vs. (Against) Payment
 *  <p>    1 - "Free": Deliver (if Sell) or Receive (if Buy) Free
 *  <p>    2 - Tri-Party
 *  <p>    3 - Hold In Custody
 */
public class Tag172EnuSettlDeliveryType extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum172SettlDeliveryType dataValue;

    public final static Enum172SettlDeliveryType TESTA_ENU_SETTL_DELIVERY_TYPE
            = Enum172SettlDeliveryType.FREE;
    public final static Enum172SettlDeliveryType TESTB_ENU_SETTL_DELIVERY_TYPE
            = Enum172SettlDeliveryType.HOLD_IN_CUSTODY;

    public Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType dataValue) {
        setFixType(FIX41.FIX172_ENU_SETTL_DELIVERY_TYPE);
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
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
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
        System.out.println( new Tag172EnuSettlDeliveryType(TESTA_ENU_SETTL_DELIVERY_TYPE).toVerboseString() );
        System.out.println( new Tag172EnuSettlDeliveryType(TESTB_ENU_SETTL_DELIVERY_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum172SettlDeliveryType oneEnum : Enum172SettlDeliveryType.values()) {
            System.out.println( new Tag172EnuSettlDeliveryType(oneEnum).toVerboseString() );
        }
    }
}
