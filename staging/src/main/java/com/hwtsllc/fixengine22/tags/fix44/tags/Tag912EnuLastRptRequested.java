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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum912LastRptRequested;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  912
 *  LastRptRequested
 *  Boolean
 *  <p></p>
 *  Indicates whether this message is that last report message
 *  in response to a request, such as Order Mass Status Request.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not last message
 *  <p>    Y - Last message
 */
public class Tag912EnuLastRptRequested extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum912LastRptRequested dataValue;

    public final static Enum912LastRptRequested TESTA_ENU_LAST_RPT_REQUESTED
            = Enum912LastRptRequested.NO ;
    public final static Enum912LastRptRequested TESTB_ENU_LAST_RPT_REQUESTED
            = Enum912LastRptRequested.YES;

    public Tag912EnuLastRptRequested( Enum912LastRptRequested dataValue) {
        setFixType(FIX44.FIX912_ENU_LAST_RPT_REQUESTED );
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
        Tag912EnuLastRptRequested tagData;

        tagData = new Tag912EnuLastRptRequested( TESTA_ENU_LAST_RPT_REQUESTED );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag912EnuLastRptRequested( TESTB_ENU_LAST_RPT_REQUESTED );
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum912LastRptRequested oneEnum : Enum912LastRptRequested.values()) {
            System.out.println( new Tag912EnuLastRptRequested(oneEnum).toVerboseString() );
        }
    }
}
