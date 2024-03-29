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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.enums.fix44.Enum935NetworkRequestType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  935
 *  NetworkRequestType
 *  int
 *  <p></p>
 *  Indicates the type and level of details required for a
 *  Network Status Request Message Boolean logic applies
 *  <p></p>
 *  e.g. If you want to subscribe for changes to certain id’s
 *  then UserRequestType = 0 (8+2), Snapshot for certain ID’s = 9 (8+1)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Snapshot
 *  <p>    2 - Subscribe
 *  <p>    4 - Stop Subscribing
 *  <p>    8 - Level of Detail, then NoCompID's becomes required
 */
public class Tag935EnuNetworkRequestType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum935NetworkRequestType dataValue;

    public final static Enum935NetworkRequestType TESTA_ENU_NETWORK_REQUEST_TYPE
            = Enum935NetworkRequestType.LEVEL_OF_DETAIL;
    public final static Enum935NetworkRequestType TESTB_ENU_NETWORK_REQUEST_TYPE
            = Enum935NetworkRequestType.SNAPSHOT;

    public Tag935EnuNetworkRequestType(Enum935NetworkRequestType dataValue) {
        setFixType(FIX44.FIX935_ENU_NETWORK_REQUEST_TYPE);
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
        Tag935EnuNetworkRequestType tagData;

        tagData = new Tag935EnuNetworkRequestType(TESTA_ENU_NETWORK_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag935EnuNetworkRequestType(TESTB_ENU_NETWORK_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            System.out.println( new Tag935EnuNetworkRequestType(oneEnum).toVerboseString() );
        }
    }
}
