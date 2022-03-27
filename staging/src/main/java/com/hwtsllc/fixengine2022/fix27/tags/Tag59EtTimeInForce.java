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
import com.hwtsllc.fixengine2022.fix27.enums.Enum59TimeInForce;

public class Tag59EtTimeInForce extends TagTypeAbstract {
    private final Enum59TimeInForce dataValue;

    public final static Enum59TimeInForce TESTA_ET_TIME_IN_FORCE = Enum59TimeInForce.DAY; // fake data
    public final static Enum59TimeInForce TESTB_ET_TIME_IN_FORCE = Enum59TimeInForce.AT_THE_CLOSE;

    public Tag59EtTimeInForce(Enum59TimeInForce dataValue) {
        setFixType(FIXType.FIX59_ET_TIME_IN_FORCE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag59EtTimeInForce tagData = new Tag59EtTimeInForce(TESTA_ET_TIME_IN_FORCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}