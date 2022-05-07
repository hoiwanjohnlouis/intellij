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
import com.hwtsllc.fixengine2022.fix44.enums.Enum940AffirmStatus;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  940
 *  AffirmStatus
 *  int
 *  Identifies the status of the ConfirmationAck.
 *  Valid values:
 *      1 - Received
 *      2 - Confirm rejected, i.e. not affirmed
 *      3 - Affirmed
 */
public class Tag940EnuAffirmStatus extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum940AffirmStatus dataValue;

    public final static Enum940AffirmStatus TESTA_ENU_AFFIRM_STATUS
            = Enum940AffirmStatus.REJECTED;
    public final static Enum940AffirmStatus TESTB_ENU_AFFIRM_STATUS
            = Enum940AffirmStatus.AFFIRMED;

    public Tag940EnuAffirmStatus(Enum940AffirmStatus dataValue) {
        setFixType(FIX44.FIX940_ENU_AFFIRM_STATUS);
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
        Tag940EnuAffirmStatus tagData;

        tagData = new Tag940EnuAffirmStatus(TESTA_ENU_AFFIRM_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag940EnuAffirmStatus(TESTB_ENU_AFFIRM_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
