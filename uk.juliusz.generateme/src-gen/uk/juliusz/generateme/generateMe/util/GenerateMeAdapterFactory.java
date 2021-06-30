/**
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.generateMe.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.juliusz.generateme.generateMe.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.juliusz.generateme.generateMe.GenerateMePackage
 * @generated
 */
public class GenerateMeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GenerateMePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenerateMeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GenerateMePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenerateMeSwitch<Adapter> modelSwitch =
    new GenerateMeSwitch<Adapter>()
    {
      @Override
      public Adapter caseGenerateMeProgram(GenerateMeProgram object)
      {
        return createGenerateMeProgramAdapter();
      }
      @Override
      public Adapter caseConfig(Config object)
      {
        return createConfigAdapter();
      }
      @Override
      public Adapter caseHomePage(HomePage object)
      {
        return createHomePageAdapter();
      }
      @Override
      public Adapter casePages(Pages object)
      {
        return createPagesAdapter();
      }
      @Override
      public Adapter caseContentPage(ContentPage object)
      {
        return createContentPageAdapter();
      }
      @Override
      public Adapter caseContactUsPage(ContactUsPage object)
      {
        return createContactUsPageAdapter();
      }
      @Override
      public Adapter caseGalleryPage(GalleryPage object)
      {
        return createGalleryPageAdapter();
      }
      @Override
      public Adapter casePhoto(Photo object)
      {
        return createPhotoAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.juliusz.generateme.generateMe.GenerateMeProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.juliusz.generateme.generateMe.GenerateMeProgram
   * @generated
   */
  public Adapter createGenerateMeProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.juliusz.generateme.generateMe.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.juliusz.generateme.generateMe.Config
   * @generated
   */
  public Adapter createConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.juliusz.generateme.generateMe.HomePage <em>Home Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.juliusz.generateme.generateMe.HomePage
   * @generated
   */
  public Adapter createHomePageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.juliusz.generateme.generateMe.Pages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.juliusz.generateme.generateMe.Pages
   * @generated
   */
  public Adapter createPagesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.juliusz.generateme.generateMe.ContentPage <em>Content Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.juliusz.generateme.generateMe.ContentPage
   * @generated
   */
  public Adapter createContentPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.juliusz.generateme.generateMe.ContactUsPage <em>Contact Us Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.juliusz.generateme.generateMe.ContactUsPage
   * @generated
   */
  public Adapter createContactUsPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.juliusz.generateme.generateMe.GalleryPage <em>Gallery Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.juliusz.generateme.generateMe.GalleryPage
   * @generated
   */
  public Adapter createGalleryPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.juliusz.generateme.generateMe.Photo <em>Photo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.juliusz.generateme.generateMe.Photo
   * @generated
   */
  public Adapter createPhotoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GenerateMeAdapterFactory