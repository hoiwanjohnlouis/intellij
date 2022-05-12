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
import com.hwtsllc.fixengine2022.fix44.enums.Enum937NetworkStatusResponseType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  937
 *  NetworkStatusResponseType
 *  int
 *  Indicates the type of Network Response Message.
 *  Valid values:
 *      1 - Full
 *      2 - Incremental Update
 */
public class Log937EnuNetworkStatusResponseType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum937NetworkStatusResponseType dataValue;

    public final static Enum937NetworkStatusResponseType TESTA_ENU_NETWORK_STATUS_RESPONSE_TYPE
            = Enum937NetworkStatusResponseType.FULL;
    public final static Enum937NetworkStatusResponseType TESTB_ENU_NETWORK_STATUS_RESPONSE_TYPE
            = Enum937NetworkStatusResponseType.INCREMENTAL;

    public Log937EnuNetworkStatusResponseType(Enum937NetworkStatusResponseType dataValue) {
        setFixType(FIX44.FIX937_ENU_NETWORK_STATUS_RESPONSE_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
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
        Log937EnuNetworkStatusResponseType tagData;

        tagData = new Log937EnuNetworkStatusResponseType(TESTA_ENU_NETWORK_STATUS_RESPONSE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log937EnuNetworkStatusResponseType(TESTB_ENU_NETWORK_STATUS_RESPONSE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
