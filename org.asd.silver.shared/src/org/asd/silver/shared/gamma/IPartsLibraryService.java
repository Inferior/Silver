/**
 * 
 */
package org.asd.silver.shared.gamma;

import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.rt.shared.validate.IValidationStrategy;
import org.eclipse.scout.rt.shared.validate.InputValidation;
import org.eclipse.scout.service.IService;

/**
 * @author AndrewL
 */
@InputValidation(IValidationStrategy.PROCESS.class)
public interface IPartsLibraryService extends IService {

  /**
   * @param formData
   * @return
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  PartsLibraryFormData create(PartsLibraryFormData formData) throws ProcessingException;

  /**
   * @param formData
   * @return
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  PartsLibraryFormData load(PartsLibraryFormData formData) throws ProcessingException;

  /**
   * @param formData
   * @return
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  PartsLibraryFormData prepareCreate(PartsLibraryFormData formData) throws ProcessingException;

  /**
   * @param formData
   * @return
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  PartsLibraryFormData store(PartsLibraryFormData formData) throws ProcessingException;
}
