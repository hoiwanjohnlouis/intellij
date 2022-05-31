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
import com.hwtsllc.fixengine2022.fix43.enums.Enum636WorkingIndicator;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  636
 *  WorkingIndicator
 *  Boolean
 *  <p>
 *  Indicates if the order is currently being worked.
 *  <p>
 *  Applicable only for OrdStatus = "New".
 *  <p>
 *  For open outcry markets this indicates that the order is being worked in the crowd.
 *  <p>
 *  For electronic markets it indicates that the order has transitioned
 *  from a contingent order to a market order.
 *  <p>
 *  Valid values:
 *  <p>    N - Order has been accepted but not yet in a working state
 *  <p>    Y - Order is currently being worked
 */
public class Tag636EnuWorkingIndicator extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final Enum636WorkingIndicator dataValue;

    public final static Enum636WorkingIndicator TESTA_ENU_WORKING_INDICATOR
            = Enum636WorkingIndicator.NO ;
    public final static Enum636WorkingIndicator TESTB_ENU_WORKING_INDICATOR
            = Enum636WorkingIndicator.YES;

    public Tag636EnuWorkingIndicator( Enum636WorkingIndicator dataValue) {
        setFixType(FIX43.FIX636_ENU_WORKING_INDICATOR );
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
        Tag636EnuWorkingIndicator tagData;

        tagData = new Tag636EnuWorkingIndicator( TESTA_ENU_WORKING_INDICATOR );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag636EnuWorkingIndicator( TESTB_ENU_WORKING_INDICATOR );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
