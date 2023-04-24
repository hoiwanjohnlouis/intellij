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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.enums.fix43.Enum636WorkingIndicator;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  636
 *  WorkingIndicator
 *  Boolean
 *  <p>
 *  Indicates if the order is currently being worked.
 *  <p>
 *  Applicable only for OrdStatus = "New".
 *  <p>
 *  For open outcry markets this indicates that the order is being worked in the crowd.
 *  <p>
 *  For electronic markets it indicates that the order has transitioned
 *  from a contingent order to a market order.
 *  <p>
 *  Valid values:
 *  <p>    N - Order has been accepted but not yet in a working state
 *  <p>    Y - Order is currently being worked
 */
public class Tag636EnuWorkingIndicator extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum636WorkingIndicator dataValue;

    public final static Enum636WorkingIndicator TESTA_ENU_WORKING_INDICATOR
            = Enum636WorkingIndicator.NO ;
    public final static Enum636WorkingIndicator TESTB_ENU_WORKING_INDICATOR
            = Enum636WorkingIndicator.YES;

    public Tag636EnuWorkingIndicator( Enum636WorkingIndicator dataValue) {
        setFixType(FIX43.FIX636_ENU_WORKING_INDICATOR );
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
        Tag636EnuWorkingIndicator tagData;

        tagData = new Tag636EnuWorkingIndicator( TESTA_ENU_WORKING_INDICATOR );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag636EnuWorkingIndicator( TESTB_ENU_WORKING_INDICATOR );
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum636WorkingIndicator oneEnum : Enum636WorkingIndicator.values()) {
            System.out.println( new Tag636EnuWorkingIndicator(oneEnum).toVerboseString() );
        }
    }
}
