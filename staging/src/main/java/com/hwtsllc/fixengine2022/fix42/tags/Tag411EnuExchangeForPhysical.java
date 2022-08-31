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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum411ExchangeForPhysical;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  411
 *  ExchangeForPhysical
 *  Boolean
 *  <p>
 *  Indicates whether or not to exchange for phsyical.
 *  <p></p>
 *  Valid values:
 *  <p>    N - False
 *  <p>    Y - True
 */
public class Tag411EnuExchangeForPhysical extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum411ExchangeForPhysical dataValue;

    public final static Enum411ExchangeForPhysical TESTA_ENU_EXCHANGE_FOR_PHYSICAL
            = Enum411ExchangeForPhysical.NO;
    public final static Enum411ExchangeForPhysical TESTB_ENU_EXCHANGE_FOR_PHYSICAL
            = Enum411ExchangeForPhysical.YES;

    public Tag411EnuExchangeForPhysical(Enum411ExchangeForPhysical dataValue) {
        setFixType(FIX42.FIX411_ENU_EXCHANGE_FOR_PHYSICAL);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
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
        Tag411EnuExchangeForPhysical tagData;

        tagData = new Tag411EnuExchangeForPhysical(TESTA_ENU_EXCHANGE_FOR_PHYSICAL);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag411EnuExchangeForPhysical(TESTB_ENU_EXCHANGE_FOR_PHYSICAL);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum411ExchangeForPhysical oneEnum : Enum411ExchangeForPhysical.values()) {
            System.out.println( new Tag411EnuExchangeForPhysical(oneEnum).toVerboseString() );
        }
    }
}
