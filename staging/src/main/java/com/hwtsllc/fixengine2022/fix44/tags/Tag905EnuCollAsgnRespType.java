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
import com.hwtsllc.fixengine2022.fix44.enums.Enum905CollAsgnRespType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  905
 *  CollAsgnRespType
 *  int
 *  <p></p>
 *  Collateral Assignment Response Type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Received
 *  <p>    1 - Accepted
 *  <p>    2 - Declined
 *  <p>    3 - Rejected
 */
public class Tag905EnuCollAsgnRespType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum905CollAsgnRespType dataValue;

    public final static Enum905CollAsgnRespType TESTA_ENU_COLL_ASGN_RESP_TYPE
            = Enum905CollAsgnRespType.ACCEPTED;
    public final static Enum905CollAsgnRespType TESTB_ENU_COLL_ASGN_RESP_TYPE
            = Enum905CollAsgnRespType.REJECTED;

    public Tag905EnuCollAsgnRespType(Enum905CollAsgnRespType dataValue) {
        setFixType(FIX44.FIX905_ENU_COLL_ASGN_RESP_TYPE);
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
        Tag905EnuCollAsgnRespType tagData;

        tagData = new Tag905EnuCollAsgnRespType(TESTA_ENU_COLL_ASGN_RESP_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag905EnuCollAsgnRespType(TESTB_ENU_COLL_ASGN_RESP_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            System.out.println( new Tag905EnuCollAsgnRespType(oneEnum).toVerboseString() );
        }
    }
}
