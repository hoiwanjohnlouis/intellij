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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.fix43.enums.Enum480CancellationRights;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  480
 *  CancellationRights
 *  char
 *  <p></p>
 *  For CIV – A one character code identifying whether Cancellation rights/Cooling off period applies.
 *  <p></p>
 *  Valid values:
 *  <p>    Y - Yes
 *  <p>    N - No - Execution Only
 *  <p>    M - No - Waiver agreement
 *  <p>    O - No - Institutional
 */
public class Tag480EnuCancellationRights extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum480CancellationRights dataValue;

    public final static Enum480CancellationRights TESTA_ENU_CANCELLATION_RIGHTS
            = Enum480CancellationRights.EXECUTION_ONLY;
    public final static Enum480CancellationRights TESTB_ENU_CANCELLATION_RIGHTS
            = Enum480CancellationRights.WAIVER_AGREEMENT;

    public Tag480EnuCancellationRights(Enum480CancellationRights dataValue) {
        setFixType(FIX43.FIX480_ENU_CANCELLATION_RIGHTS);
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
        return dataValue.toEnumNameString();
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
        Tag480EnuCancellationRights tagData;

        tagData = new Tag480EnuCancellationRights(TESTA_ENU_CANCELLATION_RIGHTS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag480EnuCancellationRights(TESTB_ENU_CANCELLATION_RIGHTS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum480CancellationRights oneEnum : Enum480CancellationRights.values()) {
            System.out.println( new Tag480EnuCancellationRights(oneEnum).toVerboseString() );
        }
    }
}
