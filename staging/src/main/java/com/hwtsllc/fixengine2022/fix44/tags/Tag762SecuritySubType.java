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

/**
 *  762
 *  SecuritySubType
 *  String
 *  Sub-type qualification/identification of the SecurityType
 *  (e.g. for SecurityType="REPO"), or the CFICode if SecurityType is not specified.
 *  If specified, SecuirtyType or CFICode is required.
 *          Example Values:
 *          General = General Collateral (for SecurityType=REPO)
 *
 *          For SecurityType="MLEG" markets can provide the name of the option
 *          or futures strategy, such as Calendar, Vertical, Butterfly, etc.
 *          NOTE: Additional values may be used by mutual agreement of the counterparties
 */
public class Tag762SecuritySubType {
}
