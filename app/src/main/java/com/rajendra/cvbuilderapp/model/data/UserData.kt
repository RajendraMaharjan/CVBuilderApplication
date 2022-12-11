package com.rajendra.cvbuilderapp.model.data

import com.rajendra.cvbuilderapp.model.Certification
import com.rajendra.cvbuilderapp.model.Education
import com.rajendra.cvbuilderapp.model.Work

class UserData {
    companion object {
        fun getEducationList(): MutableList<Education> {
            return mutableListOf(
                Education(
                    "Maharishi Internation University",
                    "Master's in Computer Science",
                    "https://maharishischool.org/wp-content/uploads/MaharishiSchoolTreeLogo-8cc541-green.jpg"
                ),
                Education(
                    "Kathmandu Engineering College",
                    "Bachelor's Degree in Computer Engineering",
                    "https://www.kecktm.edu.np/images/asso_club/ceesa.jpg"
                )
            )
        }

        fun getCertificateList(): MutableList<Certification> {
            return mutableListOf(
                Certification(
                    "https://scontent-msp1-1.xx.fbcdn.net/v/t39.30808-6/292294923_406384984845533_5509753256002794955_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=D6D_2GcFItEAX_-l4Oq&_nc_ht=scontent-msp1-1.xx&oh=00_AfDasetJ8OzT_f5YhEmP4jnmKEdXnWKUIaegZD6IMmRKCw&oe=63966463",
                    "NIIT Software Development"
                ),
                Certification(
                    "https://www.cotiviti.com.np/sites/default/files/event-date-venue.png",
                    "Agile for Excellence Workshop – Verscend Technologies"
                ),
                Certification(
                    "https://scontent-msp1-1.xx.fbcdn.net/v/t31.18172-8/11924376_1049334628431002_6857610363471025638_o.jpg?_nc_cat=102&ccb=1-7&_nc_sid=9267fe&_nc_ohc=vU8hXFTjxiYAX9nfzJJ&_nc_ht=scontent-msp1-1.xx&oh=00_AfAPXCBH2xgk3Q74Bv3JS5-LHZch9qxw8wEngDxQA6R_ZA&oe=63B9CE42",
                    "Ncell App Camp"
                )
            )
        }

        fun getWorkList(): MutableList<Work> {
            return mutableListOf(
                Work(
                    "Codeaxis Technology Pvt. Ltd.",
                    "Nov  2017",
                    "Oct 2021",
                    "Sanepa, Nepal",
                    "https://lh5.googleusercontent.com/p/AF1QipP7WB7Ku8a6GyYJJAJVEGjiAv-hdq41skU4TPJO=w408-h254-k-no",
                    "Java Software Engineer"
                ), Work(
                    "OnePlatinum Technology Pvt. Ltd.",
                    "September 2016",
                    "August 2017",
                    "Jhamsikhel, Nepal",
                    "https://img.jobsnepal.com/logos/8507_vector-logo-final.gif",
                    "Jr. Android Developer"
                ), Work(
                    "Innology Solution Pvt. Ltd.",
                    "March 2015",
                    "August 2016",
                    "Lalitpur, Nepal",
                    "https://media-exp1.licdn.com/dms/image/C4E0BAQFKtK6sXnntOQ/company-logo_200_200/0/1546510525236?e=1677110400&v=beta&t=dkquPxRhej4OoyDTfTO25ACwBncWWT_SrMFycpfhReE",
                    "Jr. Java Developer"
                )
            )
        }
    }
}