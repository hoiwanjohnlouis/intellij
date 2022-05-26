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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum263SubscriptionRequestType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  263
 *  SubscriptionRequestType
 *  char
 *  <p>
 *  Subscription Request Type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Snapshot
 *  <p>    1 - Snapshot + Updates (Subscribe)
 *  <p>    2 - Disable previous Snapshot + Update Request (Unsubscribe)
 */
public class Tag263EnuSubscriptionRequestType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum263SubscriptionRequestType dataValue;

    public final static Enum263SubscriptionRequestType TESTA_ENU_SUBSCRIPTION_REQUEST_TYPE
            = Enum263SubscriptionRequestType.SNAPSHOT;
    public final static Enum263SubscriptionRequestType TESTB_ENU_SUBSCRIPTION_REQUEST_TYPE
            = Enum263SubscriptionRequestType.SUBSCRIBE_SNAPSHOT;

    public Tag263EnuSubscriptionRequestType(Enum263SubscriptionRequestType dataValue) {
        setFixType(FIX42.FIX263_ENU_SUBSCRIPTION_REQUEST_TYPE);
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
                .concat("]");
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
        Tag263EnuSubscriptionRequestType tagData;

        tagData = new Tag263EnuSubscriptionRequestType(TESTA_ENU_SUBSCRIPTION_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag263EnuSubscriptionRequestType(TESTB_ENU_SUBSCRIPTION_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            System.out.println( new Tag263EnuSubscriptionRequestType(oneEnum).toVerboseString() );
        }
    }
}
