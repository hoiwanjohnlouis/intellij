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
import com.hwtsllc.fixengine2022.fix43.enums.Enum484PriceType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  484
 *  ExecPriceType
 *  char
 *  <p></p>
 *  For CIV - Identifies how the execution price LastPx (31)
 *  was calculated from the fund unit/share price(s) calculated
 *  at the fund valuation point.
 *  <p></p>
 *  Valid values:
 *  <p>    B - Bid price
 *  <p>    C - Creation price
 *  <p>    D - Creation price plus adjustment percent
 *  <p>    E - Creation price plus adjustment amount
 *  <p>    O - Offer price
 *  <p></p>
 *  <p>    P - Offer price minus adjustment percent
 *  <p>    Q - Offer price minus adjustment amount
 *  <p>    S - Single price
 */
public class Tag484EnuExecPriceType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum484PriceType dataValue;

    public final static Enum484PriceType TESTA_ENU_EXEC_PRICE_TYPE
            = Enum484PriceType.BID_PRICE;
    public final static Enum484PriceType TESTB_ENU_EXEC_PRICE_TYPE
            = Enum484PriceType.CREATION_PRICE_PLUS_PERCENT;

    public Tag484EnuExecPriceType(Enum484PriceType dataValue) {
        setFixType(FIX43.FIX484_ENU_EXEC_PRICE_TYPE);
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
        Tag484EnuExecPriceType tagData;

        tagData = new Tag484EnuExecPriceType(TESTA_ENU_EXEC_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag484EnuExecPriceType(TESTB_ENU_EXEC_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum484PriceType oneEnum : Enum484PriceType.values()) {
            System.out.println( new Tag484EnuExecPriceType(oneEnum).toVerboseString() );
        }
    }
}
