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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum61Urgency;

public class Tag61EtUrgency extends TagTypeAbstract {
    private final Enum61Urgency dataValue;

    public final static Enum61Urgency TESTA_ET_URGENCY = Enum61Urgency.NORMAL; // fake data
    public final static Enum61Urgency TESTB_ET_URGENCY = Enum61Urgency.BACKGROUND;

    public Tag61EtUrgency(Enum61Urgency dataValue) {
        setFixType(FIXType.FIX61_ET_URGENCY);
        setDataValue( dataValue.getID() );
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag61EtUrgency tagData = new Tag61EtUrgency(TESTA_ET_URGENCY);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}