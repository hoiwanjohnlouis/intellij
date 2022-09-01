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
import com.hwtsllc.fixengine2022.fix27.enums.Enum4AdvSide;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  4
 *  AdvSide
 *  char
 *  <p></p>
 *  Broker's side of advertised trade
 *  <p></p>
 *  Valid values:
 *  <p>    B - Buy
 *  <p>    S - Sell
 *  <p>    T - Trade
 *  <p>    X - Cross
 */
public class Tag4EnuAdvSide extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum4AdvSide dataValue;

    public final static Enum4AdvSide TESTA_ENU_ADV_SIDE
            = Enum4AdvSide.BUY;
    public final static Enum4AdvSide TESTB_ENU_ADV_SIDE
            = Enum4AdvSide.SELL;

    public Tag4EnuAdvSide(Enum4AdvSide dataValue) {
        setFixType(FIX27.FIX4_ENU_ADV_SIDE);
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
        System.out.println( new Tag4EnuAdvSide(TESTA_ENU_ADV_SIDE).toVerboseString() );
        System.out.println( new Tag4EnuAdvSide(TESTB_ENU_ADV_SIDE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            System.out.println( new Tag4EnuAdvSide(oneEnum).toVerboseString() );
        }
    }
}
