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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.enums.fix42.Enum416IncTaxInd;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  416
 *  IncTaxInd
 *  int
 *  <p></p>
 *  Code to represent whether value is net (inclusive of tax) or gross.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Net
 *  <p>    2 - Gross
 */
public class Tag416EnuIncTaxInd extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum416IncTaxInd dataValue;

    public final static Enum416IncTaxInd TESTA_ENU_INC_TAX_IND
            = Enum416IncTaxInd.GROSS;
    public final static Enum416IncTaxInd TESTB_ENU_INC_TAX_IND
            = Enum416IncTaxInd.NET;

    public Tag416EnuIncTaxInd(Enum416IncTaxInd dataValue) {
        setFixType(FIX42.FIX416_ENU_INC_TAX_IND);
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
        Tag416EnuIncTaxInd tagData;

        tagData = new Tag416EnuIncTaxInd(TESTA_ENU_INC_TAX_IND);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag416EnuIncTaxInd(TESTB_ENU_INC_TAX_IND);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum416IncTaxInd oneEnum : Enum416IncTaxInd.values()) {
            System.out.println( new Tag416EnuIncTaxInd(oneEnum).toVerboseString() );
        }
    }
}
