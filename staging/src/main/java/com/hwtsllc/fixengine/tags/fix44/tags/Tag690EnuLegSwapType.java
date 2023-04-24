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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.tags.fix44.enums.Enum690LegSwapType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  690
 *  LegSwapType
 *  int
 *  <p></p>
 *  For Fixed Income
 *  <p></p>
 *  Used instead of LegQty (687) or LegOrderQty (685)
 *      to request the respondent to calculate the quantity based on the
 *      quantity on the opposite side of the swap.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Par For Par
 *  <p>    2 - Modified Duration
 *  <p>    4 - Risk
 *  <p>    5 - Proceeds
 */
public class Tag690EnuLegSwapType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum690LegSwapType dataValue;

    public final static Enum690LegSwapType TESTA_ENU_LEG_SWAP_TYPE
            = Enum690LegSwapType.MODIFIED_DURATION;
    public final static Enum690LegSwapType TESTB_ENU_LEG_SWAP_TYPE
            = Enum690LegSwapType.PROCEEDS;

    public Tag690EnuLegSwapType(Enum690LegSwapType dataValue) {
        setFixType(FIX44.FIX690_ENU_LEG_SWAP_TYPE);
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
        Tag690EnuLegSwapType tagData;

        tagData = new Tag690EnuLegSwapType(TESTA_ENU_LEG_SWAP_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag690EnuLegSwapType(TESTB_ENU_LEG_SWAP_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum690LegSwapType oneEnum : Enum690LegSwapType.values()) {
            System.out.println( new Tag690EnuLegSwapType(oneEnum).toVerboseString() );
        }
    }
}
