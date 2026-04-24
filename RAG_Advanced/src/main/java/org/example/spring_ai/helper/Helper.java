package org.example.spring_ai.helper;

import java.util.List;

public class Helper {
    public static List<String> getData() {
        return List.of(

                // ─────────────────────────────────────────────
                // AADHAAR
                // ─────────────────────────────────────────────
                "Aadhaar Eligibility: Any individual who has resided in India for 182 days or more in the 12 months immediately preceding the application date is eligible. NRIs with valid Indian passports can apply upon arrival without the 182-day waiting period. There is no age limit — even newborns can enrol. [UIDAI]",

                "Aadhaar Enrolment Process: Visit any authorised Aadhaar Enrolment Centre (locatable on the Bhuvan Aadhaar portal). Fill the enrolment form and provide demographic and biometric data (fingerprints, iris scans, photograph). Original Proof of Identity (PoI) and Proof of Address (PoA) are mandatory. Enrolment is completely free of cost. An acknowledgement slip with an Enrolment ID is issued after submission. [UIDAI, 2025]",

                "Aadhaar Document Rules 2025: The UIDAI notified the Aadhaar (Enrolment and Update) First Amendment Regulations, 2025, effective from 2 July 2025, replacing the 2016 regulations. The amendment revised the approved document lists for Proof of Identity, Proof of Address, Proof of Relationship, and Proof of Date of Birth for all age groups including children. Accepted PoI/PoA examples include: Voter ID (EPIC), Passport, Driving Licence, PAN card, Ration Card, and recent utility bills (electricity/water/landline) not older than 3 months. [UIDAI, July 2025]",

                "Aadhaar Enrolment for Children: Children under 5 are enrolled as 'Baal Aadhaar' (blue coloured card) using the parent's Aadhaar and a Birth Certificate as Proof of Date of Birth (PDB) — mandatory for children born on or after 01-10-2023. Biometrics (fingerprints and iris) are not captured at birth. Children must complete a Mandatory Biometric Update (MBU) upon reaching age 5 and again at age 15. [UIDAI]",

                "Aadhaar Update Online (myAadhaar portal): Citizens can update Name, Address, Date of Birth, Gender, Mobile Number, and Email via myaadhaar.uidai.gov.in using Aadhaar-based OTP authentication. Address update is free online. For demographic corrections, a fee of ₹50 applies per update request at an enrolment centre. Face Authentication via the mAadhaar app is now supported for online updates. [UIDAI, 2025]",

                "mAadhaar App: The official UIDAI mobile app (mAadhaar) allows users to carry a digital copy of Aadhaar, lock/unlock biometrics, generate Virtual ID (VID), perform OTP-based authentication, and update mobile numbers. Face Authentication feature added in 2024 allows access via facial recognition on smartphones. Available on Android and iOS. [UIDAI, 2024]",

                "Aadhaar Virtual ID (VID): A 16-digit temporary, revocable number mapped to an Aadhaar number. It can be used in place of the Aadhaar number for authentication and KYC, protecting actual Aadhaar number privacy. VID can be generated or retrieved via myAadhaar portal or mAadhaar app. [UIDAI]",

                "e-Aadhaar Validity: An e-Aadhaar is a password-protected electronic copy of Aadhaar digitally signed by UIDAI, downloadable from uidai.gov.in. As per the Aadhaar Act, it is equally valid as a physical Aadhaar card for all purposes. The password is a combination of the first 4 letters of name (in CAPITALS) and year of birth (YYYY). [UIDAI]",

                "Aadhaar Grievance Redressal: Complaints can be filed at resident.uidai.gov.in or by calling the UIDAI toll-free number 1947 (available in multiple languages). Complaints can also be submitted at any Aadhaar Enrolment Centre or via email to help@uidai.gov.in. [UIDAI]",

                // ─────────────────────────────────────────────
                // PAN CARD & PAN 2.0
                // ─────────────────────────────────────────────
                "PAN Card Overview: A Permanent Account Number (PAN) is a 10-digit alphanumeric identifier issued by the Income Tax Department, mandatory for financial transactions, filing income tax returns, and as proof of identity. New PAN can be applied via Protean (NSDL) at onlineservices.nsdl.com or UTIITSL at pan.utiitsl.com. [Income Tax Dept]",

                "PAN 2.0 Project (2024-25): On 25 November 2024, the Cabinet Committee on Economic Affairs approved the PAN 2.0 project with a budget of ₹1,435 crore. It upgrades the existing PAN system with a dynamic QR code for real-time verification, a unified single portal for all PAN/TAN services, and enhanced security via a PAN Data Vault. Existing PAN cards remain fully valid — no reapplication required. [CCEA, Nov 2024]",

                "PAN 2.0 Key Changes: Under PAN 2.0, e-PAN will be issued free of cost to the registered email address. For a physical PAN card, applicants pay ₹50 (within India) or ₹15 + India Post charges (outside India). All PAN/TAN services (allotment, correction, Aadhaar-PAN linking, e-PAN request, reprint, OPV) will be hosted on a single unified ITD portal. Holding more than one PAN is illegal under the Income Tax Act. [Income Tax Dept, 2024]",

                "PAN-Aadhaar Linking: Under Section 139AA of the Income Tax Act, linking PAN with Aadhaar is mandatory. Failure to link results in the PAN becoming inoperative, leading to blocked tax refunds and higher TDS/TCS deductions. Linking can be done via the Income Tax e-filing portal (incometax.gov.in) by paying a fee of ₹1,000. [Income Tax Dept]",

                "PAN-Aadhaar Linking Exemptions: Linking is not compulsory for residents of Assam, Jammu & Kashmir, and Meghalaya; non-residents (NRIs); individuals aged 80 years or above; and non-citizens of India. [Income Tax Dept]",

                "PAN Correction/Update: Users can apply for changes via Protean (NSDL) or UTIITSL portals using Form CSF. Paperless updates are possible via Aadhaar-based e-KYC and e-Sign. Under PAN 2.0 (once fully rolled out), demographic corrections (name, DOB, address, email, mobile) will be free of cost via the unified portal. Until then, Aadhaar-based online update for address, email, and mobile is available free at NSDL and UTIITSL portals. [Income Tax Dept, 2024]",

                // ─────────────────────────────────────────────
                // PASSPORT & E-PASSPORT
                // ─────────────────────────────────────────────
                "Passport Application Steps (2025): 1. Register on the Passport Seva portal (passportindia.gov.in). 2. Log in and select 'Apply for Fresh Passport / Re-issue'. 3. Fill the online form (auto-fill supported via Aadhaar). 4. Pay fees and schedule an appointment at a PSK or POPSK. 5. Visit the PSK/POPSK with original documents on appointment date. 6. Passport is dispatched via Speed Post after police verification clearance. [MEA, 2025]",

                "E-Passport (Passport Seva 2.0): From May 2025, all new passport applicants receive a next-generation e-Passport embedded with an RFID chip storing facial biometrics, fingerprints, and encrypted demographic data, compliant with ICAO standards. Passport Seva Programme 2.0 (PSP v2.0) has been rolled out across 37 Regional Passport Offices and 544 Passport Seva Kendras. AI-powered chatbots, facial recognition, and Robotic Process Automation are integrated into the system. Over 80 lakh e-passports have been issued domestically as of late 2025. [MEA, 2025]",

                "Passport DigiLocker Integration: Applicants can now link their DigiLocker account to the Passport Seva portal for paperless document submission. Verified Aadhaar, PAN, and Driving Licence records from DigiLocker are accepted. The Passport Verification Record (PVR) is now accessible directly through DigiLocker (announced December 2025). Existing passports remain valid until their expiry. [MEA / DigiLocker, Dec 2025]",

                "Passport Police Verification (PV) Modes: Normal applications with Aadhaar, PAN, and Voter ID (EPIC) may be processed on a Post-Police Verification basis. Government employees with Annexure A are processed without police verification (No-PV). Tatkaal applications are processed on a Post-PV basis. All other cases require Pre-Police Verification before passport issuance. [MEA Passport Manual]",

                "Passport Fees (2025): Fresh Passport (36 pages, 10 years validity): ₹1,500. Fresh Passport (60 pages): ₹2,000. Tatkal Fresh Passport: ₹3,500 additional. Re-issue Passport: ₹1,500. Minor Passport (under 18, 5 years validity): ₹1,000. All fees are payable online during appointment booking. [passportindia.gov.in]",

                // ─────────────────────────────────────────────
                // VOTER ID (EPIC)
                // ─────────────────────────────────────────────
                "Voter Registration (Form 6): Indian citizens aged 18+ are eligible to register as voters. Qualifying dates for age eligibility are 1 January, 1 April, 1 July, and 1 October. Registration is done via the NVSP portal (nvsp.in), the Voters' Service Portal (voterportal.eci.gov.in), the Voter Helpline App, or offline at the Electoral Registration Officer's office. [ECI]",

                "Voter ID Correction (Form 8): Used to correct name, photo, age, or address in the electoral roll. Also used to request a replacement EPIC card, update mobile numbers, or mark PwD (Person with Disability) status. The same Form 8 is used for address change within the same constituency. [ECI]",

                "e-EPIC Download: A secure digitally signed PDF version of the Voter ID (EPIC) available on the NVSP portal or Voter Helpline App. Requires OTP verification on the registered mobile number. e-EPIC has the same legal validity as a physical Voter ID card as per ECI guidelines. [ECI]",

                "Voter Helpline: Citizens can call 1950 (national helpline) for voter registration queries, complaints about electoral roll errors, booth location, and polling day assistance. The mVoter app provides polling station location, candidate details, and voter ID status. [ECI]",

                // ─────────────────────────────────────────────
                // DRIVING LICENCE
                // ─────────────────────────────────────────────
                "Learner's Licence (LL) Application (Sarathi 4.0): Apply via the Sarathi Parivahan portal (sarathi.parivahan.gov.in). Requires Form 2, age proof (minimum 16 for gearless/50cc bikes; 18 for others), and address proof. Candidates must pass a 15-question computerized Knowledge Test — minimum 9 correct out of 15 to pass (motorcycles) or 12 out of 15 (light motor vehicle). [MoRTH, 2024]",

                "Permanent Driving Licence (DL): Eligible to apply 30 days after Learner's Licence issuance (and within 180 days of LL expiry). Requires Form 4 and a practical driving test at the RTO. DL is valid for 20 years or until age 50 (whichever is earlier); renewal required thereafter. Commercial vehicle licences require additional endorsement. [MoRTH]",

                "Driving Licence Renewal: Can be renewed online via Sarathi Parivahan portal. Applications accepted within 1 year before expiry or up to 1 year after expiry without penalty. If expired for more than 1 year, a fresh LL and re-test may be required. For renewal, Form 9 and a valid medical certificate (Form 1A) for LMV drivers above 40 are needed. [MoRTH]",

                "DigiLocker & mParivahan for DL/RC: Driving Licence (DL) and Vehicle Registration Certificate (RC) stored in DigiLocker or mParivahan app are legally valid for traffic stops and identity verification under IT Act 2000 and Motor Vehicles Act. Physical document not mandatory during traffic checks if digital copy is shown. [MoRTH, 2019 notification — upheld 2024]",

                // ─────────────────────────────────────────────
                // ELECTRICITY CONNECTION
                // ─────────────────────────────────────────────
                "Electricity New Connection (General): Applications are made via the respective state DISCOM's website or app. Documents required: PoI, PoA, site/wiring completion certificate. Under the Electricity (Rights of Consumers) Rules 2020, DISCOMs must provide connections within 7 days in metro/urban areas and 15–30 days in rural areas. [MoP, Electricity Rules 2020]",

                "Electricity New Connection (Delhi): Tata Power-DDL (North Delhi) provides connections online via tatapower-ddl.com with 2 documents in 7 days. BSES Yamuna (East/Central Delhi) and BSES Rajdhani (South/West Delhi) accept online applications via their portals and apps. BSES also allows registration via SMS: type BSESYPNCX to 56161 for Yamuna; BSESRPNCX to 56161 for Rajdhani. [TPDDL/BSES, 2024]",

                "Electricity Name Change / Transfer of Connection: Log in to the respective DISCOM portal with your CA (Consumer Account) number. Upload ownership proof (Sale Deed, GPA, or Mutation Certificate). Pay a non-refundable processing fee (approx. ₹200–₹500 depending on DISCOM). Indemnity bond may be required for inherited connections. [DISCOM guidelines]",

                "Electricity Bill Dispute: Consumers can raise disputes via the DISCOM's grievance portal, call centre, or in writing to the Grievance Redressal Officer (GRO). If unresolved within 30 days, the matter can be escalated to the State Electricity Regulatory Commission (SERC) or the Ombudsman. [Electricity Consumer Rules 2020]",

                // ─────────────────────────────────────────────
                // LPG / GAS CONNECTION
                // ─────────────────────────────────────────────
                "LPG Booking Numbers (2025): Indane Gas — WhatsApp: 7588888824, IVRS: 7718955555; HP Gas — WhatsApp: 9222201122, IVRS: 8888823456; Bharat Gas — WhatsApp: 1800224344, IVRS: 1906. All three OMCs also support booking via their mobile apps: IndianOil ONE, HP Gas app, and Bharat Gas app. [OMC official portals]",

                "LPG New Connection Online: Visit mylpg.in or the respective OMC website (indianoil.in, hindustanpetroleum.com, bharatgas.bharatpetroleum.in). Select a nearby distributor, register with KYC documents (Aadhaar, photograph, address proof), and pay the security deposit online. Connection is released after field verification. Under Ujjwala 2.0, BPL women receive connections with zero deposit and the first refill free. [OMCs, 2024]",

                "LPG Subsidy (PMUY 2025-26): For PMUY (Pradhan Mantri Ujjwala Yojana) beneficiaries, the government provides a targeted subsidy of ₹300 per 14.2 kg cylinder for up to 9 refills per year (FY 2025-26 approved outlay: ₹12,000 crore). As of July 2025, there are 10.33 crore PMUY connections. First refill and stove are provided free under Ujjwala 2.0. [Cabinet approval, July 2025]",

                "LPG Safety Protocol: In case of a gas leak, immediately turn off the regulator, open all doors/windows, avoid switching on/off electrical appliances, and call the LPG Emergency Helpline: 1906. Rubber/plastic tubing (suraksha pipe) should be ISI marked and replaced every 2 years. Do not store cylinders in enclosed spaces or basements. [PESO / OMC safety guidelines]",

                "LPG KYC and eKYC: As per government directives, all LPG consumers must complete KYC to continue receiving subsidised cylinders. eKYC can be done at the distributor point using Aadhaar-based biometric or OTP authentication, or via the respective OMC app. Linking bank account (DBT) is mandatory to receive LPG subsidy directly in bank account. [PPAC / OMC guidelines]",

                // ─────────────────────────────────────────────
                // AYUSHMAN BHARAT (PM-JAY)
                // ─────────────────────────────────────────────
                "Ayushman Bharat (PM-JAY) Eligibility: Based on SECC 2011 deprivation criteria for rural (e.g., landless households, SC/ST families, single-room kucha houses, no adult male member 16–59 years) and occupational criteria for urban workers (e.g., ragpickers, construction workers, domestic helpers). Provides cashless health coverage of up to ₹5 lakh per family per year at empanelled hospitals. [NHA]",

                "Ayushman Bharat for Senior Citizens (2024): From September 2024, all citizens aged 70 years and above are eligible for Ayushman Bharat PM-JAY coverage of ₹5 lakh per year, regardless of income. Existing PM-JAY beneficiary families with elderly members get an additional top-up cover of ₹5 lakh. Apply via the Ayushman App or pmjay.gov.in. [NHA, Sept 2024]",

                "Ayushman Card Issuance: Check eligibility at pmjay.gov.in or call the helpline 14555. Generate the Ayushman card using Aadhaar-based eKYC at any empanelled hospital, Common Service Centre (CSC), or via the Ayushman App. The card is free of cost and can be downloaded digitally. [NHA]",

                "Ayushman Bharat Health & Wellness Centres (AB-HWCs): Over 1.7 lakh Ayushman Arogya Mandirs (formerly Health and Wellness Centres) have been set up across India providing free primary care, teleconsultation, diagnostics, and medicines. Linked to the ABHA (Ayushman Bharat Health Account) digital health ID under PM-DHM. [NHA / MoHFW, 2024]",

                "ABHA (Ayushman Bharat Health Account): A unique 14-digit health ID for every citizen to digitally link health records across hospitals. Create ABHA ID at abha.abdm.gov.in using Aadhaar or driving licence. ABHA enables digital health records, e-prescriptions, and teleconsultation under the Ayushman Bharat Digital Mission (ABDM). [NHA, 2024]",

                // ─────────────────────────────────────────────
                // RATION CARD & PDS
                // ─────────────────────────────────────────────
                "Ration Card Application: Apply for a new ration card via the respective state's Food & Civil Supplies department portal (e.g., nfs.delhi.gov.in for Delhi, rcms.mp.nic.in for MP). Documents required: Aadhaar of all family members, proof of residence, and income certificate. Eligibility and card type (AAY, BPH/PHH) are determined by state-specific income norms. [State FCS Dept]",

                "Ration Card Member Management: Use 'Name Addition' for newborns (birth certificate required) or spouses (marriage certificate required) at the state FCS portal or CSC. Use 'Deletion Form' for removal due to death (death certificate required) or marriage/relocation. Field verification by a ration inspector is mandatory for new cards and additions. [NFS / State FCS]",

                "One Nation One Ration Card (ONORC): Under ONORC, any NFSA beneficiary can claim their entitled food grains from any Fair Price Shop (FPS) anywhere in India using their Aadhaar-linked ration card through ePoS (electronic Point of Sale) machines with biometric authentication. All states and UTs are covered as of 2024. [DoFPD, MoCAF&PD]",

                "Ration Card eKYC: All ration card holders must complete Aadhaar-based eKYC (seeding) to remain eligible under NFSA. eKYC can be done at the nearest Fair Price Shop via the ePoS machine using fingerprint/iris authentication, or at a CSC. Failure to complete eKYC may result in temporary suspension of ration benefits. [State FCS / DoFPD, 2024]",

                // ─────────────────────────────────────────────
                // GOVERNMENT WELFARE SCHEMES
                // ─────────────────────────────────────────────
                "PM Awas Yojana Urban 2.0 (PMAY-U 2.0): Launched on 17 September 2024, targeting 1 crore urban families over 5 years (2024–2029) with a total investment of ₹10 lakh crore. Implemented through 4 verticals: Beneficiary Led Construction (BLC, up to ₹2.5 lakh for EWS on own land), Affordable Housing in Partnership (AHP), Affordable Rental Housing (ARH), and Interest Subsidy Scheme (ISS). EWS income limit: ₹3 lakh/year; LIG: ₹6 lakh/year; MIG: ₹9 lakh/year. Apply at pmaymis.gov.in. [MoHUA, 2024]",

                "PM Awas Yojana Gramin (PMAY-G): Provides financial assistance for construction of pucca houses to rural BPL households identified via SECC 2011 data. Current unit assistance: ₹1.20 lakh in plains and ₹1.30 lakh in hilly/difficult terrain. An ongoing Awaas+ 2024 survey is identifying additional eligible rural households. Apply and check beneficiary list at pmayg.nic.in. [MoRD, 2025]",

                "PM-KISAN (PM Kisan Samman Nidhi): Provides direct income support of ₹6,000/year in three equal instalments of ₹2,000 to all land-holding farmer families. As of March 2025, 19 instalments have been disbursed; 10.06 crore farmers received the latest instalment. Farmers must complete eKYC (OTP or biometric) at pmkisan.gov.in to receive instalments. [Ministry of Agriculture, 2025]",

                "PM Jan Dhan Yojana (PMJDY): National Mission for Financial Inclusion providing zero-balance savings accounts with RuPay debit card, ₹2 lakh accidental insurance, and ₹30,000 life insurance to unbanked citizens. Over 57.86 crore accounts opened with ₹2.67 lakh crore+ balance as of 2025. 56% accounts held by women. Accounts enable Direct Benefit Transfer (DBT) for 327+ government schemes. Open at any bank branch or Business Correspondent (Bank Mitra). [DFS / Finance Ministry, 2025]",

                "PM Ujjwala Yojana (PMUY): Provides free LPG connections with zero security deposit to women from BPL households. Under Ujjwala 2.0, the first refill and cooking stove are also provided free. As of July 2025, 10.33 crore PMUY connections exist. Subsidy of ₹300/cylinder for up to 9 refills/year is provided in FY 2025-26. Apply via the distributor or at mylpg.in with Aadhaar and BPL/Ujjwala beneficiary document. [MoPNG / OMCs, 2025]",

                "PM Fasal Bima Yojana (PMFBY): Crop insurance scheme for farmers covering losses due to natural calamities, pests, and diseases. Premium rates: 2% for Kharif crops, 1.5% for Rabi crops, 5% for commercial/horticultural crops; rest is subsidised by Centre and State. Enroll via banks, CSCs, or pmfby.gov.in. Claims are processed using remote sensing, satellite data, and crop cutting experiments (CCE). [Ministry of Agriculture]",

                "Atal Pension Yojana (APY): Government-backed pension scheme for unorganised sector workers aged 18–40. Guaranteed monthly pension of ₹1,000 to ₹5,000 at age 60, depending on contribution. Contributions are auto-debited monthly from the subscriber's savings bank account. Enroll at any bank branch. Government co-contributes 50% of subscriber's contribution or ₹1,000/year (whichever is lower) for new subscribers joining before 31 March 2016. [PFRDA, NPS]",

                "PM Jeevan Jyoti Bima Yojana (PMJJBY): Life insurance cover of ₹2 lakh for death due to any cause. Annual premium: ₹436/year (revised from ₹330 in June 2022). Eligible for bank account holders aged 18–50. Auto-debit from bank account annually every 1 June. [DFS / LIC, 2024]",

                "PM Suraksha Bima Yojana (PMSBY): Accidental death and disability insurance cover of ₹2 lakh (₹1 lakh for partial disability). Annual premium: ₹20/year. Eligible for bank account holders aged 18–70. Auto-debit from bank account annually every 1 June. [DFS, 2024]",

                "PM Vishwakarma Yojana (2023–2028): Launched September 2023. Supports artisans and craftspeople (18 traditional trades including blacksmith, carpenter, potter, weaver, etc.) with skill training, toolkit incentive up to ₹15,000, collateral-free business loans (₹1 lakh at 5% interest in Phase 1; ₹2 lakh in Phase 2), and digital payment incentives. Apply via pmvishwakarma.gov.in using Aadhaar and mobile-linked bank account. [MSME Ministry, 2023]",

                "PM SVANidhi (Street Vendor Scheme): Provides working capital micro-loans to street vendors — ₹10,000 (1st loan), ₹20,000 (2nd loan), ₹50,000 (3rd loan) at subsidised interest with 7% interest subsidy. Vendors must have a Certificate of Vending or Letter of Recommendation from ULB. Apply at pmsvanidhi.mohua.gov.in or through CSCs. [MoHUA]",

                "MGNREGA (Mahatma Gandhi National Rural Employment Guarantee Act): Guarantees 100 days of wage employment per year to rural households whose adult members volunteer to do unskilled manual work. Wage rates vary by state (₹200–₹350/day approx). Job cards are issued by Gram Panchayats. Payment is directly credited to Aadhaar-linked bank accounts. Apply at the local Gram Panchayat or online at nrega.nic.in. [Ministry of Rural Development]",

                "PM Mudra Yojana (PMMY): Provides collateral-free loans up to ₹20 lakh (revised from ₹10 lakh in Budget 2024-25) to non-corporate, non-farm small/micro enterprises. Three loan categories: Shishu (up to ₹50,000), Kishore (₹50,001–₹5 lakh), Tarun (₹5 lakh–₹20 lakh). Apply at any scheduled bank, NBFC-MFI, or Mudra portal (mudra.org.in). Tarun Plus category introduced for up to ₹20 lakh for existing borrowers. [Finance Ministry, Budget 2024-25]",

                "Sukanya Samriddhi Yojana (SSY): Small savings scheme for girl child (up to age 10). Parents/guardians can open an SSY account at a post office or authorised bank with a minimum deposit of ₹250/year and a maximum of ₹1.5 lakh/year. Current interest rate: 8.2% per annum (Q1 FY 2024-25). Account matures after 21 years from opening or at the girl's marriage (after age 18). Tax benefits under Section 80C. [Finance Ministry / India Post]",

                "Kisan Credit Card (KCC): Provides farmers with short-term credit (crop loans, maintenance, post-harvest expenses) and revolving credit facility. Limit set based on landholding and crop pattern. Interest rate: 7% per annum with 3% subvention making effective rate 4% for prompt repayers. Apply at banks, cooperative societies, or RRBs. Integrated with PM-KISAN for automatic credit limit enhancement. [NABARD / Finance Ministry]",

                // ─────────────────────────────────────────────
                // DIGITAL SERVICES
                // ─────────────────────────────────────────────
                "DigiLocker: A secure government cloud platform (digilocker.gov.in) for issuing and verifying documents digitally under the IT Act 2000. Issued documents (Aadhaar, DL, RC, Degree Certificates, PAN, CBSE mark sheets, etc.) stored in DigiLocker are legally valid as originals. Over 38 crore users and 6 billion+ documents accessible as of 2024. Link via Aadhaar OTP. [MeitY / NeGD, 2024]",

                "UMANG App: Unified Mobile Application for New-age Governance — a single platform providing access to 1,200+ government services from central/state departments including PF balance, NPS, DigiLocker, EPFO, GSTN, Ayushman Bharat, Passport Seva, CBSE results, and many more. Available on Android and iOS. [MeitY]",

                "Common Service Centre (CSC): A network of 5+ lakh CSCs (Jan Seva Kendras) across India providing government-to-citizen (G2C) services including Aadhaar enrolment, PAN application, passport services, banking, insurance, PMJDY, Ayushman card, ration card services, skill development, and more. Operated by trained Village Level Entrepreneurs (VLEs). Locate at locator.csccloud.in. [MeitY / CSC SPV]",

                "National Pension System (NPS): A voluntary, long-term retirement savings scheme regulated by PFRDA. Open to all Indian citizens aged 18–70. Two types: Tier-1 (pension account, tax benefits, withdrawal restrictions) and Tier-2 (voluntary savings, no withdrawal restriction). Tax deduction available: ₹1.5 lakh under Sec 80C + additional ₹50,000 under Sec 80CCD(1B). Enroll at any Point of Presence (PoP) or online at enps.nsdl.com. [PFRDA]",

                "Income Tax e-Filing (ITR): File Income Tax Returns at incometax.gov.in. Pre-filled ITR forms (ITR-1 to ITR-7) are available with data auto-populated from Form 16, AIS, and TDS records. Due dates: 31 July for individuals (no audit); 31 October for businesses requiring audit. Income up to ₹7 lakh has zero tax liability under the new tax regime (FY 2024-25). Aadhaar-PAN linking mandatory for e-filing. [Income Tax Dept, 2024]",

                "Grievance Portal — CPGRAMS: The Centralised Public Grievance Redress and Monitoring System (cpgrams.gov.in) allows citizens to file complaints against any Central Government Ministry, Department, or Attached/Subordinate Office. Complaints are forwarded to the concerned authority for resolution within 30 days. Track grievance status using the registration number. [DARPG, GoI]"
        );
    }
}