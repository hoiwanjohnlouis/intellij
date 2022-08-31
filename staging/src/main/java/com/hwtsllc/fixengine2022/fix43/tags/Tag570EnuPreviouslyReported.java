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
import com.hwtsllc.fixengine2022.fix43.enums.Enum570PreviouslyReported;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  570
 *  PreviouslyReported
 *  Boolean
 *  <p>
 *  Indicates if the trade capture report was previously reported to the counterparty
 *  <p>
 *  Valid values:
 *  <p>    N - Not reported to counterparty
 *  <p>    Y - Previously reported to counterparty
 */
public class Tag570EnuPreviouslyReported extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum570PreviouslyReported dataValue;

    public final static Enum570PreviouslyReported TESTA_ENU_PREVIOUSLY_REPORTED
            = Enum570PreviouslyReported.NO;
    public final static Enum570PreviouslyReported TESTB_ENU_PREVIOUSLY_REPORTED
            = Enum570PreviouslyReported.YES;

    public Tag570EnuPreviouslyReported( Enum570PreviouslyReported dataValue) {
        setFixType(FIX43.FIX570_ENU_PREVIOUSLY_REPORTED);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
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
        Tag570EnuPreviouslyReported tagData;

        tagData = new Tag570EnuPreviouslyReported( TESTA_ENU_PREVIOUSLY_REPORTED );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag570EnuPreviouslyReported( TESTB_ENU_PREVIOUSLY_REPORTED );
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum570PreviouslyReported oneEnum : Enum570PreviouslyReported.values()) {
            System.out.println( new Tag570EnuPreviouslyReported(oneEnum).toVerboseString() );
        }
    }
}
