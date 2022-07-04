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
import com.hwtsllc.fixengine2022.fix42.enums.Enum334Adjustment;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  334
 *  Enu
 *  Adjustment
 *  int
 *  <p>
 *  Identifies the type of adjustment.
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    CANCEL( "1", "CANCEL", "1 - Cancel" ),
 *  <p>    ERROR( "2", "ERROR", "2 - Error" ),
 *  <p>    CORRECTION( "3", "CORRECTION", "3 - Correction" ),
 */
public class Tag334EnuAdjustment extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum334Adjustment dataValue;

    public final static Enum334Adjustment TESTA_ENU_ADJUSTMENT
            = Enum334Adjustment.CORRECTION;
    public final static Enum334Adjustment TESTB_ENU_ADJUSTMENT
            = Enum334Adjustment.ERROR;

    public Tag334EnuAdjustment(Enum334Adjustment dataValue) {
        setFixType(FIX42.FIX334_ENU_ADJUSTMENT);
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
        Tag334EnuAdjustment tagData;

        tagData = new Tag334EnuAdjustment(TESTA_ENU_ADJUSTMENT);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag334EnuAdjustment(TESTB_ENU_ADJUSTMENT);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum334Adjustment oneEnum : Enum334Adjustment.values()) {
            System.out.println( new Tag334EnuAdjustment(oneEnum).toVerboseString() );
        }
    }
}
