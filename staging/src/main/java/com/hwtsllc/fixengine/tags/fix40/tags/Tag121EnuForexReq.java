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

package com.hwtsllc.fixengine.tags.fix40.tags;

import com.hwtsllc.fixengine.datatypes.FIX40;
import com.hwtsllc.fixengine.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine.tags.fix40.enums.Enum121ForexReq;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  121
 *  ForexReq
 *  Boolean
 *  <p></p>
 *  Indicates request for forex accommodation trade to be executed along with security transaction.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Do Not Execute Forex After Security Trade
 *  <p>    Y - Execute Forex After Security Trade
 */
public class Tag121EnuForexReq extends FIX40Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum121ForexReq dataValue;

    public final static Enum121ForexReq TESTA_ENU_FOREX_REQ
            = Enum121ForexReq.NO;
    public final static Enum121ForexReq TESTB_ENU_FOREX_REQ
            = Enum121ForexReq.YES;

    public Tag121EnuForexReq(Enum121ForexReq dataValue) {
        setFixType(FIX40.FIX121_ENU_FOREX_REQ);
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
        System.out.println( new Tag121EnuForexReq(TESTA_ENU_FOREX_REQ).toVerboseString() );
        System.out.println( new Tag121EnuForexReq(TESTB_ENU_FOREX_REQ).toVerboseString() );

        // loop around the ENUM and display
        for (Enum121ForexReq oneEnum : Enum121ForexReq.values()) {
            System.out.println( new Tag121EnuForexReq(oneEnum).toVerboseString() );
        }
    }
}
