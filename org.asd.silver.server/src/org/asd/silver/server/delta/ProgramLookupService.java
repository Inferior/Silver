/**
 *
 */
package org.asd.silver.server.delta;

import org.asd.silver.shared.delta.IProgramLookupService;
import org.eclipse.scout.rt.server.services.lookup.AbstractSqlLookupService;

/**
 * @author AndrewL
 */
public class ProgramLookupService extends AbstractSqlLookupService<Long> implements IProgramLookupService {

  @Override
  protected String getConfiguredSqlSelect() {
    return "SELECT PROGRAM_ID," +
        "         PROGRAM_NAMESHORT" +
        " FROM PROGRAM" +
        " WHERE 1=1" +
        " AND DIVISION_COMPANY_COMPANY_ID = :master " +
        " <key> AND PROGRAM_ID = :key </key>" +
        " <text> AND PROGRAM_NAMESHORT LIKE :text </text>" +
        " <all> </all>";

  }
}
