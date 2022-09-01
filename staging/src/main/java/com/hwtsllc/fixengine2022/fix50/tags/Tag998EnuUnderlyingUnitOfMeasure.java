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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumUnitOfMeasure;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  996 (same as 996, 998, 999,)
 *  UnitofMeasure
 *  String
 *  <p>
 *  Physical unit of measure for Derivative products.
 *  <p></p>
 *  NOTE: Additional values may be used by mutual agreement of the counterparties
 *  <p>
 *  (http://www.unc.edu/~rowlett/units/index.html is a good source for units)
 *  <p></p>
 *  998
 *  UnderlyingUnitofMeasure
 *  String
 *  <p>
 *  Same as UnitofMeasure (996).
 *  <p></p>
 *  999
 *  LegUnitofMeasure
 *  String
 *  <p>
 *  Same as UnitofMeasure (996).
 *  <p></p>
 *  Valid values:
 *  <p>    Bbl - Barrels
 *  <p>    Bcf - Billion cubic feet
 *  <p>    Bu - Bushels
 *  <p>    lbs - pounds
 *  <p>    Gal - Gallons
 *  <p></p>
 *  <p>    MMbbl - Million Barrels
 *  <p>    MMBtu - One Million BTU
 *  <p>    MWh - Megawatt hours
 *  <p>    oz_tr - Troy Ounces
 *  <p>    t - Metric Tons (aka Tonne)
 *  <p></p>
 *  <p>    tn - Tons (US)
 *  <p>    USD - US Dollars
 */
public class Tag998EnuUnderlyingUnitOfMeasure extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumUnitOfMeasure dataValue;

    public final static MyEnumUnitOfMeasure TESTA_ENU_UNDERLYING_UNIT_OF_MEASURE
            = MyEnumUnitOfMeasure.GALLONS;
    public final static MyEnumUnitOfMeasure TESTB_ENU_UNDERLYING_UNIT_OF_MEASURE
            = MyEnumUnitOfMeasure.POUNDS;

    public Tag998EnuUnderlyingUnitOfMeasure(MyEnumUnitOfMeasure dataValue) {
        setFixType(FIX50.FIX998_ENU_UNDERLYING_UNIT_OF_MEASURE);
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
        Tag998EnuUnderlyingUnitOfMeasure tagData;

        tagData = new Tag998EnuUnderlyingUnitOfMeasure(TESTA_ENU_UNDERLYING_UNIT_OF_MEASURE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag998EnuUnderlyingUnitOfMeasure(TESTB_ENU_UNDERLYING_UNIT_OF_MEASURE);
        System.out.println(tagData.toVerboseString());
    }
}
