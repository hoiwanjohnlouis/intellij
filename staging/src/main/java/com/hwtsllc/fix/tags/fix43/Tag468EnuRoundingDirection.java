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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.enums.fix43.Enum468RoundingDirection;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  468
 *  RoundingDirection
 *  char
 *  <p></p>
 *  Specifies which direction to round
 *  <p>
 *  For CIV – indicates whether or not the quantity of shares/units
 *  is to be rounded and in which direction where CashOrdQty (152)
 *  <p>
 *  or (for CIV only) OrderPercent (516) are specified on an order.
 *  <p></p>
 *  The default is for rounding to be at the discretion of
 *  the executing broker or fund manager.
 *  <p>
 *  <p>e.g. for an order specifying CashOrdQty or OrderPercent
 *  <p>if the calculated number of shares/units was 325.76 and RoundingModulus (469) was
 *  <p>0 - "round down" would give 320 units,
 *  <p>1 - "round up" would give 330 units and "round to nearest" would give 320 units.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Round to nearest
 *  <p>    1 - Round down
 *  <p>    2 - Round up
 */
public class Tag468EnuRoundingDirection extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum468RoundingDirection dataValue;

    public final static Enum468RoundingDirection TESTA_ENU_ROUNDING_DIRECTION
            = Enum468RoundingDirection.ROUND_DOWN;
    public final static Enum468RoundingDirection TESTB_ENU_ROUNDING_DIRECTION
            = Enum468RoundingDirection.ROUND_TO_NEAREST;

    public Tag468EnuRoundingDirection(Enum468RoundingDirection dataValue) {
        setFixType(FIX43.FIX468_ENU_ROUNDING_DIRECTION);
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
        Tag468EnuRoundingDirection tagData;

        tagData = new Tag468EnuRoundingDirection(TESTA_ENU_ROUNDING_DIRECTION);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag468EnuRoundingDirection(TESTB_ENU_ROUNDING_DIRECTION);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum468RoundingDirection oneEnum : Enum468RoundingDirection.values()) {
            System.out.println( new Tag468EnuRoundingDirection(oneEnum).toVerboseString() );
        }
    }
}
