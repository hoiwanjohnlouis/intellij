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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1028ManualOrderIndicator;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1028
 *  ManualOrderIndicator
 *  Boolean
 *  <p>
 *  Indicates if the order was initially received manually (as opposed to electronically)
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Manually Order" ),
 *  <p> NO( "N", "NO", "N - Electronic Order" ),
 */
public class Tag1028EnuManualOrderIndicator extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1028ManualOrderIndicator dataValue;

    public final static Enum1028ManualOrderIndicator TESTA_ENU_MANUAL_ORDER_INDICATOR
            = Enum1028ManualOrderIndicator.NO ;
    public final static Enum1028ManualOrderIndicator TESTB_ENU_MANUAL_ORDER_INDICATOR
            = Enum1028ManualOrderIndicator.YES;

    public Tag1028EnuManualOrderIndicator(Enum1028ManualOrderIndicator dataValue) {
        setFixType(FIX50.FIX1028_ENU_MANUAL_ORDER_INDICATOR);
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
        Tag1028EnuManualOrderIndicator tagData;

        tagData = new Tag1028EnuManualOrderIndicator(TESTA_ENU_MANUAL_ORDER_INDICATOR);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1028EnuManualOrderIndicator(TESTB_ENU_MANUAL_ORDER_INDICATOR);
        System.out.println(tagData.toVerboseString());
    }
}