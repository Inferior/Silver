/**
 * 
 */
package org.asd.silver.server.alpha;

import org.asd.silver.shared.alpha.CreateNewCompanyPermission;
import org.asd.silver.shared.alpha.INewCompanyService;
import org.asd.silver.shared.alpha.NewCompanyFormData;
import org.asd.silver.shared.alpha.ReadNewCompanyPermission;
import org.asd.silver.shared.alpha.UpdateNewCompanyPermission;
import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.commons.exception.VetoException;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;
import org.eclipse.scout.service.AbstractService;

/**
 * @author AndrewL
 */
public class NewCompanyService extends AbstractService implements INewCompanyService {

  @Override
  public NewCompanyFormData create(NewCompanyFormData formData) throws ProcessingException {
    if (!ACCESS.check(new CreateNewCompanyPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }

  @Override
  public NewCompanyFormData load(NewCompanyFormData formData) throws ProcessingException {
    if (!ACCESS.check(new ReadNewCompanyPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }

  @Override
  public NewCompanyFormData prepareCreate(NewCompanyFormData formData) throws ProcessingException {
    if (!ACCESS.check(new CreateNewCompanyPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }

  @Override
  public NewCompanyFormData store(NewCompanyFormData formData) throws ProcessingException {
    if (!ACCESS.check(new UpdateNewCompanyPermission())) {
      throw new VetoException(TEXTS.get("AuthorizationFailed"));
    }
    //TODO [AndrewL] business logic here.
    return formData;
  }
}