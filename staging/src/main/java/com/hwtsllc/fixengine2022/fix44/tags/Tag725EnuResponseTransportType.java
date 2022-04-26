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
import com.hwtsllc.fixengine2022.fix44.enums.Enum725ResponseTransportType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  725
 *  ResponseTransportType
 *  Identifies how the response to the request should be transmitted.
 *              Details specified via ResponseDestination (726).
 *  Valid values:
 *      0 - Inband - transport the request was sent over (default)
 *      1 - Out of Band - pre-arranged out-of-band delivery mechanism
 *              (i.e. FTP, HTTP, NDM, etc.) between counterparties
 */
public class Tag725EnuResponseTransportType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum725ResponseTransportType dataValue;

    public final static Enum725ResponseTransportType TESTA_ENU_RESPONSE_TRANSPORT_TYPE
            = Enum725ResponseTransportType.INBAND;
    public final static Enum725ResponseTransportType TESTB_ENU_RESPONSE_TRANSPORT_TYPE
            = Enum725ResponseTransportType.OUT_OF_BAND;

    public Tag725EnuResponseTransportType(Enum725ResponseTransportType dataValue) {
        setFixType(FIX44.FIX725_ENU_RESPONSE_TRANSPORT_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag725EnuResponseTransportType tagData;

        tagData = new Tag725EnuResponseTransportType(TESTA_ENU_RESPONSE_TRANSPORT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag725EnuResponseTransportType(TESTB_ENU_RESPONSE_TRANSPORT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
