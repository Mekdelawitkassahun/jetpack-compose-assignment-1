package com.example.courselist.model

data class Course(
    val id: Int,
    val title: String,
    val code: String,
    val instructor: String,
    val description: String,
    val credits: Int,
    val schedule: String,
    val prerequisites: List<String>
) {
    companion object {
        val sampleCourses = listOf(
            Course(
                id = 1,
                title = "Mobile Application Development",
                code = "SECT-3141",
                instructor = "Mr. Betsegaw",
                description = "Learn how to make apps for smartphones using kotlin and flutter",
                credits = 3,
                schedule = "Friday 9:00-11:00",
                prerequisites = listOf("Website Development")
            ),
            Course(
                id = 2,
                title = "Entrepreneurship",
                code = "MGMT1012",
                instructor = "Dr. Belew",
                description = "learn the principles of creating jobs and opportunities for the Environment",
                credits = 3,
                schedule = "Mon/Wed 09:00-10:30",
                prerequisites = listOf("Critical Thinking")

            ),
            Course(
                id = 3,
                title = "Python",
                code = "ECEg 1052",
                instructor = "Mr. Kinde",
                description = "Learn how computers can think, solve problems, and make decisions using Algorithms",
                credits = 3,
                schedule = "wed 10:00-11:30",
                prerequisites = listOf("Data Structures and Algorithms")


            ),
            Course(
                id = 4,
                title = "Fundamentals of Artificial Intelligence (AI)",
                code = "SECT-3151",
                instructor = "Mrs. Simreteab",
                description = "Learn Introduces how computers can think, solve problems, and make decisions using AI techniques.",
                credits = 2,
                schedule = "Mon/sat 10:00-11:30",
                prerequisites = listOf("Discrete mathematics")
            ),
            Course(
                id = 5,
                title = "Operating Systems and System Programming",
                code = "SECT-3145",
                instructor = "Mr. Getnet",
                description = "Learn how operating systems manage hardware and software, and how to write system-level code.",
                credits = 3,
                schedule = "Fri 10:00-13:00",
                prerequisites = listOf("Computer Architecture")
            ),
            // Prerequisite courses
            Course(
                id = 6,
                title = "Computer Graphics",
                code = "SECT-3143",
                instructor = "Dr. Vittapu",
                description = "Learn techniques for creating images, animations, and visual effects through programming.",
                credits = 2,
                schedule = "tue/Wed 13:00-14:30",
                prerequisites = listOf("Object-Oriented Programming (OOP)")
            ),
            Course(
                id = 7,
                title = "Fundamentals of Cybersecurity",
                code = "SECT-3144",
                instructor = "Mrs. Senait",
                description = "Learn the basic methods to protect computers and data from hackers and cyber threats.",
                credits = 2,
                schedule = "Tue/fri 09:00-10:30",
                prerequisites = listOf("Computer Programming")
            ),
            Course(
                id = 8,
                title = "Data Structures and Algorithms",
                code = "CS-301",
                instructor = "Dr. Adanew",
                description = "Learn an Advanced study of data structures and algorithm analysis.",
                credits = 3,
                schedule = "Mon/Wed 15:00-16:30",
                prerequisites = listOf("Computer Programming","Python")
            ),
            Course(
                id = 9,
                title = "Human Computer Interaction",
                code = "SECT-3131",
                instructor = "Dr. Vittapu",
                description = "Learn developing a good user intefaces that are easy to use.",
                credits = 2,
                schedule = "mon/wed 11:00-12:30",
                prerequisites = listOf()
            )
            )
    }
}