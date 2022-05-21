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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine2022.fix40.enums.Bool114LocateReqd;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  114
 *  LocateReqd
 *  Boolean
 *  <p>
 *  Indicates whether the broker is to locate the stock in conjunction with a short sell order.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Indicates the broker is not required to locate
 *  <p>    Y - Indicates the broker is responsible for locating the stock
 */
public class Tag114BoolLocateReqd extends FIX40Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Bool114LocateReqd dataValue;

    public final static Bool114LocateReqd TESTA_BOOL_LOCATE_REQD
            = Bool114LocateReqd.NO;
    public final static Bool114LocateReqd TESTB_BOOL_LOCATE_REQD
            = Bool114LocateReqd.YES;

    public Tag114BoolLocateReqd(Bool114LocateReqd dataValue) {
        setFixType(FIX40.FIX114_BOOL_LOCATE_REQD);
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
        System.out.println( new Tag114BoolLocateReqd(TESTA_BOOL_LOCATE_REQD).toVerboseString() );
        System.out.println( new Tag114BoolLocateReqd(TESTB_BOOL_LOCATE_REQD).toVerboseString() );

        // loop around the ENUM and display
        for (Bool114LocateReqd oneEnum : Bool114LocateReqd.values()) {
            System.out.println( new Tag114BoolLocateReqd(oneEnum).toVerboseString() );
        }
    }
}
