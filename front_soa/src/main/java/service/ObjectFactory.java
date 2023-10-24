
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AfficherlisteComptes_QNAME = new QName("http://Service.example.org/", "afficherlisteComptes");
    private final static QName _Convertir_QNAME = new QName("http://Service.example.org/", "convertir");
    private final static QName _AjouterMontant_QNAME = new QName("http://Service.example.org/", "ajouterMontant");
    private final static QName _RetirerCompte_QNAME = new QName("http://Service.example.org/", "retirerCompte");
    private final static QName _Add_QNAME = new QName("http://Service.example.org/", "add");
    private final static QName _AjouterMontantResponse_QNAME = new QName("http://Service.example.org/", "ajouterMontantResponse");
    private final static QName _RetirerMontant_QNAME = new QName("http://Service.example.org/", "retirerMontant");
    private final static QName _RetirerCompteResponse_QNAME = new QName("http://Service.example.org/", "retirerCompteResponse");
    private final static QName _RetirerMontantResponse_QNAME = new QName("http://Service.example.org/", "retirerMontantResponse");
    private final static QName _AddResponse_QNAME = new QName("http://Service.example.org/", "addResponse");
    private final static QName _AfficherlisteComptesResponse_QNAME = new QName("http://Service.example.org/", "afficherlisteComptesResponse");
    private final static QName _ConvertirResponse_QNAME = new QName("http://Service.example.org/", "convertirResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AjouterMontantResponse }
     * 
     */
    public AjouterMontantResponse createAjouterMontantResponse() {
        return new AjouterMontantResponse();
    }

    /**
     * Create an instance of {@link RetirerMontant }
     * 
     */
    public RetirerMontant createRetirerMontant() {
        return new RetirerMontant();
    }

    /**
     * Create an instance of {@link RetirerCompteResponse }
     * 
     */
    public RetirerCompteResponse createRetirerCompteResponse() {
        return new RetirerCompteResponse();
    }

    /**
     * Create an instance of {@link RetirerMontantResponse }
     * 
     */
    public RetirerMontantResponse createRetirerMontantResponse() {
        return new RetirerMontantResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link AfficherlisteComptesResponse }
     * 
     */
    public AfficherlisteComptesResponse createAfficherlisteComptesResponse() {
        return new AfficherlisteComptesResponse();
    }

    /**
     * Create an instance of {@link ConvertirResponse }
     * 
     */
    public ConvertirResponse createConvertirResponse() {
        return new ConvertirResponse();
    }

    /**
     * Create an instance of {@link AfficherlisteComptes }
     * 
     */
    public AfficherlisteComptes createAfficherlisteComptes() {
        return new AfficherlisteComptes();
    }

    /**
     * Create an instance of {@link Convertir }
     * 
     */
    public Convertir createConvertir() {
        return new Convertir();
    }

    /**
     * Create an instance of {@link AjouterMontant }
     * 
     */
    public AjouterMontant createAjouterMontant() {
        return new AjouterMontant();
    }

    /**
     * Create an instance of {@link RetirerCompte }
     * 
     */
    public RetirerCompte createRetirerCompte() {
        return new RetirerCompte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherlisteComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "afficherlisteComptes")
    public JAXBElement<AfficherlisteComptes> createAfficherlisteComptes(AfficherlisteComptes value) {
        return new JAXBElement<AfficherlisteComptes>(_AfficherlisteComptes_QNAME, AfficherlisteComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convertir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "convertir")
    public JAXBElement<Convertir> createConvertir(Convertir value) {
        return new JAXBElement<Convertir>(_Convertir_QNAME, Convertir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterMontant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "ajouterMontant")
    public JAXBElement<AjouterMontant> createAjouterMontant(AjouterMontant value) {
        return new JAXBElement<AjouterMontant>(_AjouterMontant_QNAME, AjouterMontant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "retirerCompte")
    public JAXBElement<RetirerCompte> createRetirerCompte(RetirerCompte value) {
        return new JAXBElement<RetirerCompte>(_RetirerCompte_QNAME, RetirerCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterMontantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "ajouterMontantResponse")
    public JAXBElement<AjouterMontantResponse> createAjouterMontantResponse(AjouterMontantResponse value) {
        return new JAXBElement<AjouterMontantResponse>(_AjouterMontantResponse_QNAME, AjouterMontantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerMontant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "retirerMontant")
    public JAXBElement<RetirerMontant> createRetirerMontant(RetirerMontant value) {
        return new JAXBElement<RetirerMontant>(_RetirerMontant_QNAME, RetirerMontant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "retirerCompteResponse")
    public JAXBElement<RetirerCompteResponse> createRetirerCompteResponse(RetirerCompteResponse value) {
        return new JAXBElement<RetirerCompteResponse>(_RetirerCompteResponse_QNAME, RetirerCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerMontantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "retirerMontantResponse")
    public JAXBElement<RetirerMontantResponse> createRetirerMontantResponse(RetirerMontantResponse value) {
        return new JAXBElement<RetirerMontantResponse>(_RetirerMontantResponse_QNAME, RetirerMontantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherlisteComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "afficherlisteComptesResponse")
    public JAXBElement<AfficherlisteComptesResponse> createAfficherlisteComptesResponse(AfficherlisteComptesResponse value) {
        return new JAXBElement<AfficherlisteComptesResponse>(_AfficherlisteComptesResponse_QNAME, AfficherlisteComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "convertirResponse")
    public JAXBElement<ConvertirResponse> createConvertirResponse(ConvertirResponse value) {
        return new JAXBElement<ConvertirResponse>(_ConvertirResponse_QNAME, ConvertirResponse.class, null, value);
    }

}
