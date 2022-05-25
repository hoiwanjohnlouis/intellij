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
import com.hwtsllc.fixengine2022.fix42.enums.Enum419BasisPxType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  419
 *  BasisPxType
 *  char
 *  <p>
 *  Code to represent the basis price type.
 *  <p></p>
 *  Valid values:
 *  <p>    2 - Closing price at morning session
 *  <p>    3 - Closing price
 *  <p>    4 - Current price
 *  <p>    5 - SQ
 *  <p>    6 - VWAP through a day
 *  <p></p>
 *  <p>    7 - VWAP through a morning session
 *  <p>    8 - VWAP through an afternoon session
 *  <p>    9 - VWAP through a day except "YORI" (an opening auction)
 *  <p></p>
 *  <p>    A - VWAP through a morning session except "YORI" (an opening auction)
 *  <p>    B - VWAP through an afternoon session except "YORI" (an opening auction)
 *  <p>    C - Strike
 *  <p>    D - Open
 *  <p></p>
 *  <p>    Z - Others
 */
public class Tag419EnuBasisPxType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum419BasisPxType dataValue;

    public final static Enum419BasisPxType TESTA_ENU_BASIS_PX_TYPE
            = Enum419BasisPxType.CLOSING_PRICE_MORNING;
    public final static Enum419BasisPxType TESTB_ENU_BASIS_PX_TYPE
            = Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI;

    public Tag419EnuBasisPxType(Enum419BasisPxType dataValue) {
        setFixType(FIX42.FIX419_ENU_BASIS_PX_TYPE);
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
        Tag419EnuBasisPxType tagData;

        tagData = new Tag419EnuBasisPxType(TESTA_ENU_BASIS_PX_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag419EnuBasisPxType(TESTB_ENU_BASIS_PX_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
