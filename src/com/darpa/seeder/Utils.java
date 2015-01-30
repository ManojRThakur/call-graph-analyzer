package com.darpa.seeder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Utils {
	
	public static void printNext(HashSet<String> set) {
		System.out.println("---------------------------------------------------------------------------");
		for(String s : set) {
			log(s);
		}
		System.out.println("---------------------------------------------------------------------------");
	}
	
	public static void log(String msg) {
		System.out.println("["+Thread.currentThread().getName()+"-"+new Date()+"] " + msg);
	}
	
	public static void writeIdentifiedClasses(HashSet<String> set) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			File file = new File(System.getProperty("user.dir")+"/finalClasses-"+Thread.currentThread().getName());
			StringBuffer content = new StringBuffer();
			
			for(String s : set) {
				content.append(s).append("\r\n");
			}
			
			if (!file.exists()) {
				file.createNewFile();
			}
 
			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			bw.write(content.toString());
			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static boolean areSetsEqual(Set<String> set1, Set<String> set2) {
		if(set1.size() != set2.size())
			return false;
		else {
			TreeSet<String> set_1 = new TreeSet<String>(set1);
			TreeSet<String> set_2 = new TreeSet<String>(set2);
			
			Iterator<String> itr1 = set_1.iterator();
			Iterator<String> itr2 = set_2.iterator();
			
			while(itr1.hasNext()) {
				String s1 = itr1.next().trim(); 
				String s2 = itr2.next().trim();
				
				if(!s1.equals(s2)) {
					System.out.println(s1 + " X " + s2);
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		set1.add("<java.lang.Character: char[] toChars(int)>");
		set1.add("<java.nio.charset.CoderResult: java.lang.String toString()>");
		set1.add("<sun.security.x509.X509CertImpl: java.lang.String toString()>");
		set1.add("<sun.security.x509.KeyUsageExtension: java.lang.String toString()>");
		set1.add("<sun.security.x509.SubjectAlternativeNameExtension: java.lang.String toString()>");
		set1.add("<java.security.Timestamp: java.lang.String toString()>");
		set1.add("<java.io.PrintStream: void write(java.lang.String)>");
		set1.add("<java.util.AbstractCollection: java.lang.String toString()>");
		set1.add("<java.math.MutableBigInteger: void <init>()>");
		set1.add("<java.lang.String: int indexOf(int)>");
		set1.add("<java.util.ResourceBundle$CacheKey: java.lang.String toString()>");
		set1.add("<java.io.OutputStreamWriter: void write(java.lang.String,int,int)>");
		set1.add("<java.lang.reflect.InvocationTargetException: java.lang.Throwable getCause()>");
		set1.add("<java.io.PrintStream: void newLine()>");
		set1.add("<java.lang.Class: java.lang.String toString()>");
		set1.add("<sun.security.x509.GeneralSubtree: java.lang.String toString()>");
		set1.add("<java.math.MutableBigInteger: java.math.MutableBigInteger divideMagnitude(int[],java.math.MutableBigInteger)>");
		set1.add("<java.lang.Throwable: void <init>(java.lang.String)>");
		set1.add("<java.lang.RuntimeException: void <init>()>");
		set1.add("<java.math.MutableBigInteger: void <init>(java.math.MutableBigInteger)>");
		set1.add("<java.security.UnresolvedPermission: java.lang.String toString()>");
		set1.add("<java.lang.Boolean: java.lang.String toString()>");
		set1.add("<java.security.CodeSigner: java.lang.String toString()>");
		set1.add("<sun.security.x509.AlgorithmId: java.lang.String toString()>");
		set1.add("<sun.security.x509.GeneralName: java.lang.String toString()>");
		set1.add("<sun.nio.cs.StreamEncoder: void write(char[],int,int)>");
		set1.add("<java.lang.Object: java.lang.String toString()>");
		set1.add("<java.lang.ProcessEnvironment$StringEntry: java.lang.String toString()>");
		set1.add("<java.io.PrintStream: void ensureOpen()>");
		set1.add("<sun.security.x509.SerialNumber: java.lang.String toString()>");
		set1.add("<java.io.OutputStream: void flush()>");
		set1.add("<java.lang.StringBuilder: void <init>()>");
		set1.add("<java.net.InetAddress: java.lang.String toString()>");
		set1.add("<java.lang.AbstractStringBuilder: void expandCapacity(int)>");
		set1.add("<sun.security.x509.RDN: java.lang.String toString()>");
		set1.add("<sun.security.x509.AVA: java.lang.String toString()>");
		set1.add("<java.lang.String: void getChars(int,int,char[],int)>");
		set1.add("<java.lang.Double: java.lang.String toString()>");
		set1.add("<java.util.ResourceBundle$1: java.lang.String toString()>");
		set1.add("<sun.security.x509.X509CRLImpl: java.lang.String toString()>");
		set1.add("<sun.misc.FloatingDecimal: java.lang.String toJavaFormatString()>");
		set1.add("<java.text.FieldPosition: java.lang.String toString()>");
		set1.add("<sun.security.x509.AccessDescription: java.lang.String toString()>");
		set1.add("<java.lang.Integer: java.lang.String toString(int)>");
		set1.add("<sun.security.jca.ProviderList: java.lang.String toString()>");
		set1.add("<sun.util.calendar.CalendarDate: java.lang.String toString()>");
		set1.add("<java.util.Arrays: int[] copyOfRange(int[],int,int)>");
		set1.add("<sun.security.ec.NamedCurve: java.lang.String toString()>");
		set1.add("<java.math.BigInteger: java.lang.String toString()>");
		set1.add("<java.lang.Byte: java.lang.String toString()>");
		set1.add("<java.lang.Throwable: java.lang.String toString()>");
		set1.add("<sun.security.pkcs.PKCS9Attribute: java.lang.String toString()>");
		set1.add("<java.lang.AbstractStringBuilder: java.lang.AbstractStringBuilder append(java.lang.String)>");
		set1.add("<java.lang.IllegalArgumentException: void <init>()>");
		set1.add("<sun.security.x509.PolicyConstraintsExtension: java.lang.String toString()>");
		set1.add("<java.lang.Integer: int stringSize(int)>");
		set1.add("<java.lang.Integer: java.lang.String toString()>");
		set1.add("<java.math.MutableBigInteger: int compare(java.math.MutableBigInteger)>");
		set1.add("<java.lang.RuntimeException: void <init>(java.lang.String)>");
		set1.add("<java.util.Hashtable: java.lang.String toString()>");
		set1.add("<java.lang.AbstractStringBuilder: void <init>(int)>");
		set1.add("<java.lang.StringIndexOutOfBoundsException: void <init>(int)>");
		set1.add("<java.lang.Throwable: java.lang.StackTraceElement[] getOurStackTrace()>");
		set1.add("<java.security.Provider$Service: java.lang.String toString()>");
		set1.add("<sun.security.pkcs.PKCS9Attributes: java.lang.String toString()>");
		set1.add("<sun.security.x509.BasicConstraintsExtension: java.lang.String toString()>");
		set1.add("<sun.security.x509.X500Name: java.lang.String toString()>");
		set1.add("<java.lang.Thread: java.lang.Thread currentThread()>");
		set1.add("<java.lang.ThreadGroup: java.lang.String toString()>");
		set1.add("<sun.security.provider.PolicyFile$SelfPermission: java.lang.String toString()>");
		set1.add("<sun.security.provider.PolicyParser$PrincipalEntry: java.lang.String toString()>");
		set1.add("<java.math.MutableBigInteger: void clear()>");
		set1.add("<java.lang.Throwable: void <init>()>");
		set1.add("<java.lang.Math: int min(int,int)>");
		set1.add("<java.lang.String: java.lang.String valueOf(double)>");
		set1.add("<java.security.CodeSource: java.lang.String toString()>");
		set1.add("<java.lang.StringBuilder: java.lang.StringBuilder append(int)>");
		set1.add("<sun.security.x509.IssuerAlternativeNameExtension: java.lang.String toString()>");
		set1.add("<java.lang.IllegalArgumentException: void <init>(java.lang.String)>");
		set1.add("<sun.security.util.ObjectIdentifier: java.lang.String toString()>");
		set1.add("<java.security.PermissionCollection: java.lang.String toString()>");
		set1.add("<java.lang.Package: java.lang.String toString()>");
		set1.add("<sun.security.x509.SubjectKeyIdentifierExtension: java.lang.String toString()>");
		set1.add("<java.lang.StringBuffer: java.lang.StringBuffer append(java.lang.String)>");
		set1.add("<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.Object)>");
		set1.add("<java.io.PrintStream: void println(java.lang.String)>");
		set1.add("<java.lang.String: int indexOf(int,int)>");
		set1.add("<sun.jkernel.Mutex: java.lang.String toString()>");
		set1.add("<java.lang.Enum: java.lang.String toString()>");
		set1.add("<sun.nio.cs.StreamEncoder: void ensureOpen()>");
		set1.add("<java.lang.Character$Subset: java.lang.String toString()>");
		set1.add("<sun.security.x509.PolicyMappingsExtension: java.lang.String toString()>");
		set1.add("<java.util.Vector: java.lang.String toString()>");
		set1.add("<java.lang.String: java.lang.String toString()>");
		set1.add("<java.lang.Throwable: java.lang.Throwable getCause()>");
		set1.add("<sun.misc.FloatingDecimal: void <init>(double)>");
		set1.add("<java.lang.IndexOutOfBoundsException: void <init>()>");
		set1.add("<java.math.MutableBigInteger: void <init>(int[])>");
		set1.add("<sun.misc.ExtensionInfo: java.lang.String toString()>");
		set1.add("<java.io.BufferedWriter: void ensureOpen()>");
		set1.add("<sun.security.x509.X509CRLEntryImpl: java.lang.String toString()>");
		set1.add("<java.text.AttributeEntry: java.lang.String toString()>");
		set1.add("<org.ietf.jgss.Oid: java.lang.String toString()>");
		set1.add("<java.lang.ExceptionInInitializerError: java.lang.Throwable getCause()>");
		set1.add("<java.lang.System: void arraycopy(java.lang.Object,int,java.lang.Object,int,int)>");
		set1.add("<sun.security.x509.ReasonFlags: java.lang.String toString()>");
		set1.add("<javax.security.auth.x500.X500Principal: java.lang.String toString()>");
		set1.add("<java.lang.StringBuffer: java.lang.AbstractStringBuilder append(java.lang.String)>");
		set1.add("<java.lang.Double: java.lang.String toString(double)>");
		set1.add("<java.util.jar.Attributes$Name: java.lang.String toString()>");
		set1.add("<java.math.BigInteger: java.math.BigInteger abs()>");
		set1.add("<sun.security.ec.ECPublicKeyImpl: java.lang.String toString()>");
		set1.add("<java.lang.Exception: void <init>(java.lang.String)>");
		set1.add("<sun.jkernel.Bundle: java.lang.String toString()>");
		set1.add("<java.util.TreeMap$Entry: java.lang.String toString()>");
		set1.add("<java.lang.StringBuilder: java.lang.StringBuilder append(char)>");
		set1.add("<sun.nio.cs.StreamEncoder: void write(java.lang.String,int,int)>");
		set1.add("<sun.security.x509.ExtendedKeyUsageExtension: java.lang.String toString()>");
		set1.add("<java.lang.AbstractStringBuilder: java.lang.AbstractStringBuilder append(int)>");
		set1.add("<java.lang.String: int length()>");
		set1.add("<sun.security.x509.PolicyInformation: java.lang.String toString()>");
		set1.add("<sun.security.util.DerValue: java.lang.String toString()>");
		set1.add("<java.util.AbstractMap: java.lang.String toString()>");
		set1.add("<java.security.Provider$UString: java.lang.String toString()>");
		set1.add("<java.io.Writer: void write(java.lang.String)>");
		set1.add("<java.io.OutputStreamWriter: void flushBuffer()>");
		set1.add("<sun.security.x509.KeyIdentifier: java.lang.String toString()>");
		set1.add("<java.math.BigInteger: long longValue()>");
		set1.add("<sun.util.calendar.Era: java.lang.String toString()>");
		set1.add("<sun.nio.cs.StreamEncoder: void implWrite(char[],int,int)>");
		set1.add("<java.util.Currency: java.lang.String toString()>");
		set1.add("<sun.security.x509.Extension: java.lang.String toString()>");
		set1.add("<sun.security.x509.DistributionPoint: java.lang.String toString()>");
		set1.add("<java.text.AttributedCharacterIterator$Attribute: java.lang.String toString()>");
		set1.add("<sun.security.x509.UnparseableExtension: java.lang.String toString()>");
		set1.add("<java.io.BufferedWriter: void write(java.lang.String,int,int)>");
		set1.add("<java.lang.Integer: java.lang.String toString(int,int)>");
		set1.add("<java.lang.Thread: java.lang.String toString()>");
		set1.add("<java.security.Provider: java.lang.String toString()>");
		set1.add("<sun.misc.Signal: java.lang.String toString()>");
		set1.add("<java.lang.ArithmeticException: void <init>(java.lang.String)>");
		set1.add("<sun.security.x509.NetscapeCertTypeExtension: java.lang.String toString()>");
		set1.add("<java.lang.Object: void <init>()>");
		set1.add("<java.util.Arrays: char[] copyOfRange(char[],int,int)>");
		set1.add("<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>");
		set1.add("<java.lang.String: java.lang.String valueOf(java.lang.Object)>");
		set1.add("<java.math.MutableBigInteger: void <init>(int)>");
		set1.add("<java.lang.ProcessEnvironment$ExternalData: java.lang.String toString()>");
		set1.add("<java.lang.ClassNotFoundException: java.lang.Throwable getCause()>");
		set1.add("<java.lang.Exception: void <init>()>");
		set1.add("<java.lang.reflect.Constructor: java.lang.String toString()>");
		set1.add("<sun.util.calendar.ImmutableGregorianDate: java.lang.String toString()>");
		set1.add("<java.lang.AbstractStringBuilder: int stringSizeOfInt(int)>");
		set1.add("<java.lang.String: void <init>(int,int,char[])>");
		set1.add("<java.lang.Double: long doubleToLongBits(double)>");
		set1.add("<java.math.MutableBigInteger: java.math.MutableBigInteger divide(java.math.MutableBigInteger,java.math.MutableBigInteger)>");
		set1.add("<java.util.HashMap$Entry: java.lang.String toString()>");
		set1.add("<sun.security.jca.ProviderConfig: java.lang.String toString()>");
		set1.add("<sun.security.x509.GeneralNames: java.lang.String toString()>");
		set1.add("<java.security.cert.TrustAnchor: java.lang.String toString()>");
		set1.add("<java.io.BufferedWriter: void flushBuffer()>");
		set1.add("<java.lang.Long: java.lang.String toString(long)>");
		set1.add("<java.util.SimpleTimeZone: java.lang.String toString()>");
		set1.add("<java.lang.StringBuilder: java.lang.AbstractStringBuilder append(java.lang.String)>");
		set1.add("<sun.security.x509.AuthorityKeyIdentifierExtension: java.lang.String toString()>");
		set1.add("<sun.security.x509.AuthorityInfoAccessExtension: java.lang.String toString()>");
		set1.add("<sun.util.calendar.LocalGregorianCalendar$Date: java.lang.String toString()>");
		set1.add("<org.ietf.jgss.GSSException: java.lang.String toString()>");
		set1.add("<java.security.cert.PolicyQualifierInfo: java.lang.String toString()>");
		set1.add("<java.io.File: java.lang.String toString()>");
		set1.add("<sun.security.x509.NameConstraintsExtension: java.lang.String toString()>");
		set1.add("<java.util.Hashtable$Entry: java.lang.String toString()>");
		set1.add("<sun.security.x509.X509Key: java.lang.String toString()>");
		set1.add("<java.lang.Thread: void interrupt()>");
		set1.add("<java.math.MutableBigInteger: int divideOneWord(int,java.math.MutableBigInteger)>");
		set1.add("<java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntry: java.lang.String toString()>");
		set1.add("<java.net.URL: java.lang.String toString()>");
		set1.add("<java.util.Date: java.lang.String toString()>");
		set1.add("<sun.security.x509.PrivateKeyUsageExtension: java.lang.String toString()>");
		set1.add("<java.util.Locale: java.lang.String toString()>");
		set1.add("<java.lang.StringBuilder: java.lang.String toString()>");
		set1.add("<java.lang.Character: void toSurrogates(int,char[],int)>");
		set1.add("<java.lang.Throwable: java.lang.Throwable fillInStackTrace()>");
		set1.add("<java.io.BufferedWriter: int min(int,int)>");
		set1.add("<java.lang.IndexOutOfBoundsException: void <init>(java.lang.String)>");
		set1.add("<java.lang.Throwable: void printStackTraceAsCause(java.io.PrintStream,java.lang.StackTraceElement[])>");
		set1.add("<java.io.BufferedOutputStream: void flush()>");
		set1.add("<sun.security.pkcs.SignerInfo: java.lang.String toString()>");
		set1.add("<sun.misc.FloatingDecimal: void dtoa(int,long,int)>");
		set1.add("<sun.security.jgss.ProviderList$PreferencesEntry: java.lang.String toString()>");
		set1.add("<java.lang.String: void <init>(char[],int,int)>");
		set1.add("<sun.util.calendar.ZoneInfo: java.lang.String toString()>");
		set1.add("<sun.security.x509.IssuingDistributionPointExtension: java.lang.String toString()>");
		set1.add("<java.lang.StringBuffer: java.lang.String toString()>");
		set1.add("<java.math.BigInteger: java.lang.String toString(int)>");
		set1.add("<sun.security.provider.PolicyFile$PolicyEntry: java.lang.String toString()>");
		set1.add("<java.lang.String: java.lang.String valueOf(int)>");
		set1.add("<java.lang.Long: int stringSize(long)>");
		set1.add("<sun.security.x509.CRLNumberExtension: java.lang.String toString()>");
		set1.add("<java.util.regex.Pattern: java.lang.String toString()>");
		set1.add("<java.lang.Integer: void getChars(int,int,char[])>");
		set1.add("<sun.security.x509.CertificatePolicyMap: java.lang.String toString()>");
		set1.add("<java.lang.AbstractStringBuilder: java.lang.AbstractStringBuilder append(char)>");
		set1.add("<java.math.MutableBigInteger: java.math.BigInteger toBigInteger(int)>");
		set1.add("<java.security.ProtectionDomain: java.lang.String toString()>");
		set1.add("<sun.security.x509.DistributionPointName: java.lang.String toString()>");
		set1.add("<java.io.PrintStream: void print(java.lang.String)>");
		set1.add("<java.lang.StringBuilder: void <init>(int)>");
		set1.add("<sun.security.x509.CRLReasonCodeExtension: java.lang.String toString()>");
		set1.add("<java.security.Permission: java.lang.String toString()>");
		set1.add("<java.security.MessageDigest: java.lang.String toString()>");
		set1.add("<javax.crypto.SunJCE_f: java.lang.String toString()>");
		set1.add("<sun.security.x509.CRLDistributionPointsExtension: java.lang.String toString()>");
		set1.add("<sun.security.x509.CertificatePoliciesExtension: java.lang.String toString()>");
		set1.add("<sun.security.x509.CertificateIssuerExtension: java.lang.String toString()>");
		set1.add("<java.lang.Long: java.lang.String toString(long,int)>");
		set1.add("<java.lang.Long: void getChars(long,int,char[])>");


		
		set2.add("<java.lang.Character: char[] toChars(int)>");
		set2.add("<java.nio.charset.CoderResult: java.lang.String toString()>");
		set2.add("<sun.security.x509.X509CertImpl: java.lang.String toString()>");
		set2.add("<sun.security.x509.KeyUsageExtension: java.lang.String toString()>");
		set2.add("<sun.security.x509.SubjectAlternativeNameExtension: java.lang.String toString()>");
		set2.add("<java.security.Timestamp: java.lang.String toString()>");
		set2.add("<java.io.PrintStream: void write(java.lang.String)>");
		set2.add("<java.util.AbstractCollection: java.lang.String toString()>");
		set2.add("<java.math.MutableBigInteger: void <init>()>");
		set2.add("<java.lang.String: int indexOf(int)>");
		set2.add("<java.util.ResourceBundle$CacheKey: java.lang.String toString()>");
		set2.add("<java.io.OutputStreamWriter: void write(java.lang.String,int,int)>");
		set2.add("<java.lang.reflect.InvocationTargetException: java.lang.Throwable getCause()>");
		set2.add("<java.io.PrintStream: void newLine()>");
		set2.add("<java.lang.Class: java.lang.String toString()>");
		set2.add("<sun.security.x509.GeneralSubtree: java.lang.String toString()>");
		set2.add("<java.math.MutableBigInteger: java.math.MutableBigInteger divideMagnitude(int[],java.math.MutableBigInteger)>");
		set2.add("<java.lang.Throwable: void <init>(java.lang.String)>");
		set2.add("<java.lang.RuntimeException: void <init>()>");
		set2.add("<java.math.MutableBigInteger: void <init>(java.math.MutableBigInteger)>");
		set2.add("<java.security.UnresolvedPermission: java.lang.String toString()>");
		set2.add("<java.lang.Boolean: java.lang.String toString()>");
		set2.add("<java.security.CodeSigner: java.lang.String toString()>");
		set2.add("<sun.security.x509.AlgorithmId: java.lang.String toString()>");
		set2.add("<sun.security.x509.GeneralName: java.lang.String toString()>");
		set2.add("<sun.nio.cs.StreamEncoder: void write(char[],int,int)>");
		set2.add("<java.lang.Object: java.lang.String toString()>");
		set2.add("<java.lang.ProcessEnvironment$StringEntry: java.lang.String toString()>");
		set2.add("<java.io.PrintStream: void ensureOpen()>");
		set2.add("<sun.security.x509.SerialNumber: java.lang.String toString()>");
		set2.add("<java.io.OutputStream: void flush()>");
		set2.add("<java.lang.StringBuilder: void <init>()>");
		set2.add("<java.net.InetAddress: java.lang.String toString()>");
		set2.add("<java.lang.AbstractStringBuilder: void expandCapacity(int)>");
		set2.add("<sun.security.x509.RDN: java.lang.String toString()>");
		set2.add("<sun.security.x509.AVA: java.lang.String toString()>");
		set2.add("<java.lang.String: void getChars(int,int,char[],int)>");
		set2.add("<java.lang.Double: java.lang.String toString()>");
		set2.add("<java.util.ResourceBundle$1: java.lang.String toString()>");
		set2.add("<sun.security.x509.X509CRLImpl: java.lang.String toString()>");
		set2.add("<sun.misc.FloatingDecimal: java.lang.String toJavaFormatString()>");
		set2.add("<java.text.FieldPosition: java.lang.String toString()>");
		set2.add("<sun.security.x509.AccessDescription: java.lang.String toString()>");
		set2.add("<java.lang.Integer: java.lang.String toString(int)>");
		set2.add("<sun.security.jca.ProviderList: java.lang.String toString()>");
		set2.add("<sun.util.calendar.CalendarDate: java.lang.String toString()>");
		set2.add("<java.util.Arrays: int[] copyOfRange(int[],int,int)>");
		set2.add("<sun.security.ec.NamedCurve: java.lang.String toString()>");
		set2.add("<java.math.BigInteger: java.lang.String toString()>");
		set2.add("<java.lang.Byte: java.lang.String toString()>");
		set2.add("<java.lang.Throwable: java.lang.String toString()>");
		set2.add("<sun.security.pkcs.PKCS9Attribute: java.lang.String toString()>");
		set2.add("<java.lang.AbstractStringBuilder: java.lang.AbstractStringBuilder append(java.lang.String)>");
		set2.add("<java.lang.IllegalArgumentException: void <init>()>");
		set2.add("<sun.security.x509.PolicyConstraintsExtension: java.lang.String toString()>");
		set2.add("<java.lang.Integer: int stringSize(int)>");
		set2.add("<java.lang.Integer: java.lang.String toString()>");
		set2.add("<java.math.MutableBigInteger: int compare(java.math.MutableBigInteger)>");
		set2.add("<java.lang.RuntimeException: void <init>(java.lang.String)>");
		set2.add("<java.util.Hashtable: java.lang.String toString()>");
		set2.add("<java.lang.AbstractStringBuilder: void <init>(int)>");
		set2.add("<java.lang.StringIndexOutOfBoundsException: void <init>(int)>");
		set2.add("<java.lang.Throwable: java.lang.StackTraceElement[] getOurStackTrace()>");
		set2.add("<java.security.Provider$Service: java.lang.String toString()>");
		set2.add("<sun.security.pkcs.PKCS9Attributes: java.lang.String toString()>");
		set2.add("<sun.security.x509.BasicConstraintsExtension: java.lang.String toString()>");
		set2.add("<sun.security.x509.X500Name: java.lang.String toString()>");
		set2.add("<java.lang.Thread: java.lang.Thread currentThread()>");
		set2.add("<java.lang.ThreadGroup: java.lang.String toString()>");
		set2.add("<sun.security.provider.PolicyFile$SelfPermission: java.lang.String toString()>");
		set2.add("<sun.security.provider.PolicyParser$PrincipalEntry: java.lang.String toString()>");
		set2.add("<java.math.MutableBigInteger: void clear()>");
		set2.add("<java.lang.Throwable: void <init>()>");
		set2.add("<java.lang.Math: int min(int,int)>");
		set2.add("<java.lang.String: java.lang.String valueOf(double)>");
		set2.add("<java.security.CodeSource: java.lang.String toString()>");
		set2.add("<java.lang.StringBuilder: java.lang.StringBuilder append(int)>");
		set2.add("<sun.security.x509.IssuerAlternativeNameExtension: java.lang.String toString()>");
		set2.add("<java.lang.IllegalArgumentException: void <init>(java.lang.String)>");
		set2.add("<sun.security.util.ObjectIdentifier: java.lang.String toString()>");
		set2.add("<java.security.PermissionCollection: java.lang.String toString()>");
		set2.add("<java.lang.Package: java.lang.String toString()>");
		set2.add("<sun.security.x509.SubjectKeyIdentifierExtension: java.lang.String toString()>");
		set2.add("<java.lang.StringBuffer: java.lang.StringBuffer append(java.lang.String)>");
		set2.add("<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.Object)>");
		set2.add("<java.io.PrintStream: void println(java.lang.String)>");
		set2.add("<java.lang.String: int indexOf(int,int)>");
		set2.add("<sun.jkernel.Mutex: java.lang.String toString()>");
		set2.add("<java.lang.Enum: java.lang.String toString()>");
		set2.add("<sun.nio.cs.StreamEncoder: void ensureOpen()>");
		set2.add("<java.lang.Character$Subset: java.lang.String toString()>");
		set2.add("<sun.security.x509.PolicyMappingsExtension: java.lang.String toString()>");
		set2.add("<java.util.Vector: java.lang.String toString()>");
		set2.add("<java.lang.String: java.lang.String toString()>");
		set2.add("<java.lang.Throwable: java.lang.Throwable getCause()>");
		set2.add("<sun.misc.FloatingDecimal: void <init>(double)>");
		set2.add("<java.lang.IndexOutOfBoundsException: void <init>()>");
		set2.add("<java.math.MutableBigInteger: void <init>(int[])>");
		set2.add("<sun.misc.ExtensionInfo: java.lang.String toString()>");
		set2.add("<java.io.BufferedWriter: void ensureOpen()>");
		set2.add("<sun.security.x509.X509CRLEntryImpl: java.lang.String toString()>");
		set2.add("<java.text.AttributeEntry: java.lang.String toString()>");
		set2.add("<org.ietf.jgss.Oid: java.lang.String toString()>");
		set2.add("<java.lang.ExceptionInInitializerError: java.lang.Throwable getCause()>");
		set2.add("<java.lang.System: void arraycopy(java.lang.Object,int,java.lang.Object,int,int)>");
		set2.add("<sun.security.x509.ReasonFlags: java.lang.String toString()>");
		set2.add("<javax.security.auth.x500.X500Principal: java.lang.String toString()>");
		set2.add("<java.lang.StringBuffer: java.lang.AbstractStringBuilder append(java.lang.String)>");
		set2.add("<java.lang.Double: java.lang.String toString(double)>");
		set2.add("<java.util.jar.Attributes$Name: java.lang.String toString()>");
		set2.add("<java.math.BigInteger: java.math.BigInteger abs()>");
		set2.add("<sun.security.ec.ECPublicKeyImpl: java.lang.String toString()>");
		set2.add("<java.lang.Exception: void <init>(java.lang.String)>");
		set2.add("<sun.jkernel.Bundle: java.lang.String toString()>");
		set2.add("<java.util.TreeMap$Entry: java.lang.String toString()>");
		set2.add("<java.lang.StringBuilder: java.lang.StringBuilder append(char)>");
		set2.add("<sun.nio.cs.StreamEncoder: void write(java.lang.String,int,int)>");
		set2.add("<sun.security.x509.ExtendedKeyUsageExtension: java.lang.String toString()>");
		set2.add("<java.lang.AbstractStringBuilder: java.lang.AbstractStringBuilder append(int)>");
		set2.add("<java.lang.String: int length()>");
		set2.add("<sun.security.x509.PolicyInformation: java.lang.String toString()>");
		set2.add("<sun.security.util.DerValue: java.lang.String toString()>");
		set2.add("<java.util.AbstractMap: java.lang.String toString()>");
		set2.add("<java.security.Provider$UString: java.lang.String toString()>");
		set2.add("<java.io.Writer: void write(java.lang.String)>");
		set2.add("<java.io.OutputStreamWriter: void flushBuffer()>");
		set2.add("<sun.security.x509.KeyIdentifier: java.lang.String toString()>");
		set2.add("<java.math.BigInteger: long longValue()>");
		set2.add("<sun.util.calendar.Era: java.lang.String toString()>");
		set2.add("<sun.nio.cs.StreamEncoder: void implWrite(char[],int,int)>");
		set2.add("<java.util.Currency: java.lang.String toString()>");
		set2.add("<sun.security.x509.Extension: java.lang.String toString()>");
		set2.add("<sun.security.x509.DistributionPoint: java.lang.String toString()>");
		set2.add("<java.text.AttributedCharacterIterator$Attribute: java.lang.String toString()>");
		set2.add("<sun.security.x509.UnparseableExtension: java.lang.String toString()>");
		set2.add("<java.io.BufferedWriter: void write(java.lang.String,int,int)>");
		set2.add("<java.lang.Integer: java.lang.String toString(int,int)>");
		set2.add("<java.lang.Thread: java.lang.String toString()>");
		set2.add("<java.security.Provider: java.lang.String toString()>");
		set2.add("<sun.misc.Signal: java.lang.String toString()>");
		set2.add("<java.lang.ArithmeticException: void <init>(java.lang.String)>");
		set2.add("<sun.security.x509.NetscapeCertTypeExtension: java.lang.String toString()>");
		set2.add("<java.lang.Object: void <init>()>");
		set2.add("<java.util.Arrays: char[] copyOfRange(char[],int,int)>");
		set2.add("<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>");
		set2.add("<java.lang.String: java.lang.String valueOf(java.lang.Object)>");
		set2.add("<java.math.MutableBigInteger: void <init>(int)>");
		set2.add("<java.lang.ProcessEnvironment$ExternalData: java.lang.String toString()>");
		set2.add("<java.lang.ClassNotFoundException: java.lang.Throwable getCause()>");
		set2.add("<java.lang.Exception: void <init>()>");
		set2.add("<java.lang.reflect.Constructor: java.lang.String toString()>");
		set2.add("<sun.util.calendar.ImmutableGregorianDate: java.lang.String toString()>");
		set2.add("<java.lang.AbstractStringBuilder: int stringSizeOfInt(int)>");
		set2.add("<java.lang.String: void <init>(int,int,char[])>");
		set2.add("<java.lang.Double: long doubleToLongBits(double)>");
		set2.add("<java.math.MutableBigInteger: java.math.MutableBigInteger divide(java.math.MutableBigInteger,java.math.MutableBigInteger)>");
		set2.add("<java.util.HashMap$Entry: java.lang.String toString()>");
		set2.add("<sun.security.jca.ProviderConfig: java.lang.String toString()>");
		set2.add("<sun.security.x509.GeneralNames: java.lang.String toString()>");
		set2.add("<java.security.cert.TrustAnchor: java.lang.String toString()>");
		set2.add("<java.io.BufferedWriter: void flushBuffer()>");
		set2.add("<java.lang.Long: java.lang.String toString(long)>");
		set2.add("<java.util.SimpleTimeZone: java.lang.String toString()>");
		set2.add("<java.lang.StringBuilder: java.lang.AbstractStringBuilder append(java.lang.String)>");
		set2.add("<sun.security.x509.AuthorityKeyIdentifierExtension: java.lang.String toString()>");
		set2.add("<sun.security.x509.AuthorityInfoAccessExtension: java.lang.String toString()>");
		set2.add("<sun.util.calendar.LocalGregorianCalendar$Date: java.lang.String toString()>");
		set2.add("<org.ietf.jgss.GSSException: java.lang.String toString()>");
		set2.add("<java.security.cert.PolicyQualifierInfo: java.lang.String toString()>");
		set2.add("<java.io.File: java.lang.String toString()>");
		set2.add("<sun.security.x509.NameConstraintsExtension: java.lang.String toString()>");
		set2.add("<java.util.Hashtable$Entry: java.lang.String toString()>");
		set2.add("<sun.security.x509.X509Key: java.lang.String toString()>");
		set2.add("<java.lang.Thread: void interrupt()>");
		set2.add("<java.math.MutableBigInteger: int divideOneWord(int,java.math.MutableBigInteger)>");
		set2.add("<java.util.Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntry: java.lang.String toString()>");
		set2.add("<java.net.URL: java.lang.String toString()>");
		set2.add("<java.util.Date: java.lang.String toString()>");
		set2.add("<sun.security.x509.PrivateKeyUsageExtension: java.lang.String toString()>");
		set2.add("<java.util.Locale: java.lang.String toString()>");
		set2.add("<java.lang.StringBuilder: java.lang.String toString()>");
		set2.add("<java.lang.Character: void toSurrogates(int,char[],int)>");
		set2.add("<java.lang.Throwable: java.lang.Throwable fillInStackTrace()>");
		set2.add("<java.io.BufferedWriter: int min(int,int)>");
		set2.add("<java.lang.IndexOutOfBoundsException: void <init>(java.lang.String)>");
		set2.add("<java.lang.Throwable: void printStackTraceAsCause(java.io.PrintStream,java.lang.StackTraceElement[])>");
		set2.add("<java.io.BufferedOutputStream: void flush()>");
		set2.add("<sun.security.pkcs.SignerInfo: java.lang.String toString()>");
		set2.add("<sun.misc.FloatingDecimal: void dtoa(int,long,int)>");
		set2.add("<sun.security.jgss.ProviderList$PreferencesEntry: java.lang.String toString()>");
		set2.add("<java.lang.String: void <init>(char[],int,int)>");
		set2.add("<sun.util.calendar.ZoneInfo: java.lang.String toString()>");
		set2.add("<sun.security.x509.IssuingDistributionPointExtension: java.lang.String toString()>");
		set2.add("<java.lang.StringBuffer: java.lang.String toString()>");
		set2.add("<java.math.BigInteger: java.lang.String toString(int)>");
		set2.add("<sun.security.provider.PolicyFile$PolicyEntry: java.lang.String toString()>");
		set2.add("<java.lang.String: java.lang.String valueOf(int)>");
		set2.add("<java.lang.Long: int stringSize(long)>");
		set2.add("<sun.security.x509.CRLNumberExtension: java.lang.String toString()>");
		set2.add("<java.util.regex.Pattern: java.lang.String toString()>");
		set2.add("<java.lang.Integer: void getChars(int,int,char[])>");
		set2.add("<sun.security.x509.CertificatePolicyMap: java.lang.String toString()>");
		set2.add("<java.lang.AbstractStringBuilder: java.lang.AbstractStringBuilder append(char)>");
		set2.add("<java.math.MutableBigInteger: java.math.BigInteger toBigInteger(int)>");
		set2.add("<java.security.ProtectionDomain: java.lang.String toString()>");
		set2.add("<sun.security.x509.DistributionPointName: java.lang.String toString()>");
		set2.add("<java.io.PrintStream: void print(java.lang.String)>");
		set2.add("<java.lang.StringBuilder: void <init>(int)>");
		set2.add("<sun.security.x509.CRLReasonCodeExtension: java.lang.String toString()>");
		set2.add("<java.security.Permission: java.lang.String toString()>");
		set2.add("<java.security.MessageDigest: java.lang.String toString()>");
		set2.add("<javax.crypto.SunJCE_f: java.lang.String toString()>");
		set2.add("<sun.security.x509.CRLDistributionPointsExtension: java.lang.String toString()>");
		set2.add("<sun.security.x509.CertificatePoliciesExtension: java.lang.String toString()>");
		set2.add("<sun.security.x509.CertificateIssuerExtension: java.lang.String toString()>");
		set2.add("<java.lang.Long: java.lang.String toString(long,int)>");
		set2.add("<java.lang.Long: void getChars(long,int,char[])>");

		
		System.out.println(areSetsEqual(set1, set2));
	}
	
}
