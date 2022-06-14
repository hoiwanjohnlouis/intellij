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
import com.hwtsllc.fixengine2022.fix44.enums.Enum852PublishTrdIndicator;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  852
 *  PublishTrdIndicator
 *  Boolean
 *  <p></p>
 *  Indicates if a trade should be reported via a market reporting service.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Do Not Report Trade
 *  <p>    Y - Report Trade
 */
public class Tag852EnuPublishTrdIndicator extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum852PublishTrdIndicator dataValue;

    public final static Enum852PublishTrdIndicator TESTA_ENU_REVERSAL_INDICATOR
            = Enum852PublishTrdIndicator.NO ;
    public final static Enum852PublishTrdIndicator TESTB_ENU_REVERSAL_INDICATOR
            = Enum852PublishTrdIndicator.YES;

    public Tag852EnuPublishTrdIndicator( Enum852PublishTrdIndicator dataValue) {
        setFixType(FIX44.FIX852_ENU_PUBLISH_TRD_INDICATOR );
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
        Tag852EnuPublishTrdIndicator tagData;

        tagData = new Tag852EnuPublishTrdIndicator( TESTA_ENU_REVERSAL_INDICATOR );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag852EnuPublishTrdIndicator( TESTB_ENU_REVERSAL_INDICATOR );
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum852PublishTrdIndicator oneEnum : Enum852PublishTrdIndicator.values()) {
            System.out.println( new Tag852EnuPublishTrdIndicator(oneEnum).toVerboseString() );
        }
    }
}