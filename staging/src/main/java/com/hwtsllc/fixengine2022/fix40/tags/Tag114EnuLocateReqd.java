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
import com.hwtsllc.fixengine2022.fix40.enums.Enum114LocateReqd;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  114
 *  LocateReqd
 *  Boolean
 *  <p></p>
 *  Indicates whether the broker is to locate the stock in conjunction with a short sell order.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Indicates the broker is not required to locate
 *  <p>    Y - Indicates the broker is responsible for locating the stock
 */
public class Tag114EnuLocateReqd extends FIX40Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum114LocateReqd dataValue;

    public final static Enum114LocateReqd TESTA_ENU_LOCATE_REQD
            = Enum114LocateReqd.NO;
    public final static Enum114LocateReqd TESTB_ENU_LOCATE_REQD
            = Enum114LocateReqd.YES;

    public Tag114EnuLocateReqd(Enum114LocateReqd dataValue) {
        setFixType(FIX40.FIX114_ENU_LOCATE_REQD);
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
        System.out.println( new Tag114EnuLocateReqd(TESTA_ENU_LOCATE_REQD).toVerboseString() );
        System.out.println( new Tag114EnuLocateReqd(TESTB_ENU_LOCATE_REQD).toVerboseString() );

        // loop around the ENUM and display
        for (Enum114LocateReqd oneEnum : Enum114LocateReqd.values()) {
            System.out.println( new Tag114EnuLocateReqd(oneEnum).toVerboseString() );
        }
    }
}
