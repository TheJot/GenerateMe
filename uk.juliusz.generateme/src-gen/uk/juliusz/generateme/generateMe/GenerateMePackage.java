/**
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.generateMe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.juliusz.generateme.generateMe.GenerateMeFactory
 * @model kind="package"
 * @generated
 */
public interface GenerateMePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "generateMe";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.juliusz.uk/generateme/GenerateMe";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "generateMe";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenerateMePackage eINSTANCE = uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl.init();

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.GenerateMeProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMeProgramImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getGenerateMeProgram()
   * @generated
   */
  int GENERATE_ME_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_ME_PROGRAM__CONFIG = 0;

  /**
   * The feature id for the '<em><b>Home Page</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_ME_PROGRAM__HOME_PAGE = 1;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_ME_PROGRAM__PAGES = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_ME_PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.ConfigImpl <em>Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.ConfigImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getConfig()
   * @generated
   */
  int CONFIG = 1;

  /**
   * The feature id for the '<em><b>Business Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__BUSINESS_NAME = 0;

  /**
   * The number of structural features of the '<em>Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.HomePageImpl <em>Home Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.HomePageImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getHomePage()
   * @generated
   */
  int HOME_PAGE = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_PAGE__CONTENT = 0;

  /**
   * The feature id for the '<em><b>Introduction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_PAGE__INTRODUCTION = 1;

  /**
   * The number of structural features of the '<em>Home Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_PAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.PagesImpl <em>Pages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.PagesImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getPages()
   * @generated
   */
  int PAGES = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGES__NAME = 0;

  /**
   * The number of structural features of the '<em>Pages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.ContentPageImpl <em>Content Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.ContentPageImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getContentPage()
   * @generated
   */
  int CONTENT_PAGE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PAGE__NAME = PAGES__NAME;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PAGE__HEADER = PAGES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PAGE__SECTION = PAGES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Content Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PAGE_FEATURE_COUNT = PAGES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.SectionImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getSection()
   * @generated
   */
  int SECTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__TITLE = 1;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__CONTENT = 2;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.ContactPageImpl <em>Contact Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.ContactPageImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getContactPage()
   * @generated
   */
  int CONTACT_PAGE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_PAGE__NAME = PAGES__NAME;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_PAGE__HEADER = PAGES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_PAGE__FROM = PAGES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_PAGE__TO = PAGES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Contact Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_PAGE_FEATURE_COUNT = PAGES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.GalleryPageImpl <em>Gallery Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.GalleryPageImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getGalleryPage()
   * @generated
   */
  int GALLERY_PAGE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY_PAGE__NAME = PAGES__NAME;

  /**
   * The feature id for the '<em><b>Photos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY_PAGE__PHOTOS = PAGES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Gallery Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GALLERY_PAGE_FEATURE_COUNT = PAGES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.juliusz.generateme.generateMe.impl.PhotoImpl <em>Photo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.juliusz.generateme.generateMe.impl.PhotoImpl
   * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getPhoto()
   * @generated
   */
  int PHOTO = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHOTO__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHOTO__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHOTO__FILE_NAME = 2;

  /**
   * The number of structural features of the '<em>Photo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHOTO_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.GenerateMeProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see uk.juliusz.generateme.generateMe.GenerateMeProgram
   * @generated
   */
  EClass getGenerateMeProgram();

  /**
   * Returns the meta object for the containment reference '{@link uk.juliusz.generateme.generateMe.GenerateMeProgram#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Config</em>'.
   * @see uk.juliusz.generateme.generateMe.GenerateMeProgram#getConfig()
   * @see #getGenerateMeProgram()
   * @generated
   */
  EReference getGenerateMeProgram_Config();

  /**
   * Returns the meta object for the containment reference '{@link uk.juliusz.generateme.generateMe.GenerateMeProgram#getHomePage <em>Home Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Home Page</em>'.
   * @see uk.juliusz.generateme.generateMe.GenerateMeProgram#getHomePage()
   * @see #getGenerateMeProgram()
   * @generated
   */
  EReference getGenerateMeProgram_HomePage();

  /**
   * Returns the meta object for the containment reference list '{@link uk.juliusz.generateme.generateMe.GenerateMeProgram#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see uk.juliusz.generateme.generateMe.GenerateMeProgram#getPages()
   * @see #getGenerateMeProgram()
   * @generated
   */
  EReference getGenerateMeProgram_Pages();

  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config</em>'.
   * @see uk.juliusz.generateme.generateMe.Config
   * @generated
   */
  EClass getConfig();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.Config#getBusinessName <em>Business Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Business Name</em>'.
   * @see uk.juliusz.generateme.generateMe.Config#getBusinessName()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_BusinessName();

  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.HomePage <em>Home Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Home Page</em>'.
   * @see uk.juliusz.generateme.generateMe.HomePage
   * @generated
   */
  EClass getHomePage();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.HomePage#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see uk.juliusz.generateme.generateMe.HomePage#getContent()
   * @see #getHomePage()
   * @generated
   */
  EAttribute getHomePage_Content();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.HomePage#getIntroduction <em>Introduction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Introduction</em>'.
   * @see uk.juliusz.generateme.generateMe.HomePage#getIntroduction()
   * @see #getHomePage()
   * @generated
   */
  EAttribute getHomePage_Introduction();

  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.Pages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pages</em>'.
   * @see uk.juliusz.generateme.generateMe.Pages
   * @generated
   */
  EClass getPages();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.Pages#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.juliusz.generateme.generateMe.Pages#getName()
   * @see #getPages()
   * @generated
   */
  EAttribute getPages_Name();

  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.ContentPage <em>Content Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Page</em>'.
   * @see uk.juliusz.generateme.generateMe.ContentPage
   * @generated
   */
  EClass getContentPage();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.ContentPage#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see uk.juliusz.generateme.generateMe.ContentPage#getHeader()
   * @see #getContentPage()
   * @generated
   */
  EAttribute getContentPage_Header();

  /**
   * Returns the meta object for the containment reference list '{@link uk.juliusz.generateme.generateMe.ContentPage#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Section</em>'.
   * @see uk.juliusz.generateme.generateMe.ContentPage#getSection()
   * @see #getContentPage()
   * @generated
   */
  EReference getContentPage_Section();

  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see uk.juliusz.generateme.generateMe.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.juliusz.generateme.generateMe.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.Section#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see uk.juliusz.generateme.generateMe.Section#getTitle()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Title();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.Section#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see uk.juliusz.generateme.generateMe.Section#getContent()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Content();

  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.ContactPage <em>Contact Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contact Page</em>'.
   * @see uk.juliusz.generateme.generateMe.ContactPage
   * @generated
   */
  EClass getContactPage();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.ContactPage#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see uk.juliusz.generateme.generateMe.ContactPage#getHeader()
   * @see #getContactPage()
   * @generated
   */
  EAttribute getContactPage_Header();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.ContactPage#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see uk.juliusz.generateme.generateMe.ContactPage#getFrom()
   * @see #getContactPage()
   * @generated
   */
  EAttribute getContactPage_From();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.ContactPage#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see uk.juliusz.generateme.generateMe.ContactPage#getTo()
   * @see #getContactPage()
   * @generated
   */
  EAttribute getContactPage_To();

  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.GalleryPage <em>Gallery Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gallery Page</em>'.
   * @see uk.juliusz.generateme.generateMe.GalleryPage
   * @generated
   */
  EClass getGalleryPage();

  /**
   * Returns the meta object for the containment reference list '{@link uk.juliusz.generateme.generateMe.GalleryPage#getPhotos <em>Photos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Photos</em>'.
   * @see uk.juliusz.generateme.generateMe.GalleryPage#getPhotos()
   * @see #getGalleryPage()
   * @generated
   */
  EReference getGalleryPage_Photos();

  /**
   * Returns the meta object for class '{@link uk.juliusz.generateme.generateMe.Photo <em>Photo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Photo</em>'.
   * @see uk.juliusz.generateme.generateMe.Photo
   * @generated
   */
  EClass getPhoto();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.Photo#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.juliusz.generateme.generateMe.Photo#getName()
   * @see #getPhoto()
   * @generated
   */
  EAttribute getPhoto_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.Photo#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see uk.juliusz.generateme.generateMe.Photo#getDescription()
   * @see #getPhoto()
   * @generated
   */
  EAttribute getPhoto_Description();

  /**
   * Returns the meta object for the attribute '{@link uk.juliusz.generateme.generateMe.Photo#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Name</em>'.
   * @see uk.juliusz.generateme.generateMe.Photo#getFileName()
   * @see #getPhoto()
   * @generated
   */
  EAttribute getPhoto_FileName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GenerateMeFactory getGenerateMeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.GenerateMeProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMeProgramImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getGenerateMeProgram()
     * @generated
     */
    EClass GENERATE_ME_PROGRAM = eINSTANCE.getGenerateMeProgram();

    /**
     * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATE_ME_PROGRAM__CONFIG = eINSTANCE.getGenerateMeProgram_Config();

    /**
     * The meta object literal for the '<em><b>Home Page</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATE_ME_PROGRAM__HOME_PAGE = eINSTANCE.getGenerateMeProgram_HomePage();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATE_ME_PROGRAM__PAGES = eINSTANCE.getGenerateMeProgram_Pages();

    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.ConfigImpl <em>Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.ConfigImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getConfig()
     * @generated
     */
    EClass CONFIG = eINSTANCE.getConfig();

    /**
     * The meta object literal for the '<em><b>Business Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__BUSINESS_NAME = eINSTANCE.getConfig_BusinessName();

    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.HomePageImpl <em>Home Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.HomePageImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getHomePage()
     * @generated
     */
    EClass HOME_PAGE = eINSTANCE.getHomePage();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOME_PAGE__CONTENT = eINSTANCE.getHomePage_Content();

    /**
     * The meta object literal for the '<em><b>Introduction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOME_PAGE__INTRODUCTION = eINSTANCE.getHomePage_Introduction();

    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.PagesImpl <em>Pages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.PagesImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getPages()
     * @generated
     */
    EClass PAGES = eINSTANCE.getPages();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGES__NAME = eINSTANCE.getPages_Name();

    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.ContentPageImpl <em>Content Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.ContentPageImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getContentPage()
     * @generated
     */
    EClass CONTENT_PAGE = eINSTANCE.getContentPage();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PAGE__HEADER = eINSTANCE.getContentPage_Header();

    /**
     * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PAGE__SECTION = eINSTANCE.getContentPage_Section();

    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.SectionImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__CONTENT = eINSTANCE.getSection_Content();

    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.ContactPageImpl <em>Contact Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.ContactPageImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getContactPage()
     * @generated
     */
    EClass CONTACT_PAGE = eINSTANCE.getContactPage();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTACT_PAGE__HEADER = eINSTANCE.getContactPage_Header();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTACT_PAGE__FROM = eINSTANCE.getContactPage_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTACT_PAGE__TO = eINSTANCE.getContactPage_To();

    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.GalleryPageImpl <em>Gallery Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.GalleryPageImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getGalleryPage()
     * @generated
     */
    EClass GALLERY_PAGE = eINSTANCE.getGalleryPage();

    /**
     * The meta object literal for the '<em><b>Photos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GALLERY_PAGE__PHOTOS = eINSTANCE.getGalleryPage_Photos();

    /**
     * The meta object literal for the '{@link uk.juliusz.generateme.generateMe.impl.PhotoImpl <em>Photo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.juliusz.generateme.generateMe.impl.PhotoImpl
     * @see uk.juliusz.generateme.generateMe.impl.GenerateMePackageImpl#getPhoto()
     * @generated
     */
    EClass PHOTO = eINSTANCE.getPhoto();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHOTO__NAME = eINSTANCE.getPhoto_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHOTO__DESCRIPTION = eINSTANCE.getPhoto_Description();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHOTO__FILE_NAME = eINSTANCE.getPhoto_FileName();

  }

} //GenerateMePackage
