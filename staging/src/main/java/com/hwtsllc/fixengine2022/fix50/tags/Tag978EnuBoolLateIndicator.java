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
import com.hwtsllc.fixengine2022.fix50.enums.Enum978LateIndicator;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  978
 *  LateIndicator
 *  Boolean
 *  <p>
 *  Indicates if the contrary intention was received after the exchange imposed cutoff time
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - After the exchange cutoff time" ),
 *  <p> NO( "N", "NO", "N - Received during normal exchange hours" ),
 */
public class Tag978EnuBoolLateIndicator extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum978LateIndicator dataValue;

    public final static Enum978LateIndicator TESTA_ENU_LATE_INDICATOR
            = Enum978LateIndicator.NO ;
    public final static Enum978LateIndicator TESTB_ENU_LATE_INDICATOR
            = Enum978LateIndicator.YES;

    public Tag978EnuBoolLateIndicator(Enum978LateIndicator dataValue) {
        setFixType(FIX50.FIX978_ENU_LATE_INDICATOR);
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
        Tag978EnuBoolLateIndicator tagData;

        tagData = new Tag978EnuBoolLateIndicator(TESTA_ENU_LATE_INDICATOR);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag978EnuBoolLateIndicator(TESTB_ENU_LATE_INDICATOR);
        System.out.println(tagData.toVerboseString());
    }
}